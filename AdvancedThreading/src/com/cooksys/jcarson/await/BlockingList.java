package com.cooksys.jcarson.await;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BlockingList {
	
	private Lock lock = new ReentrantLock();

	private Condition isEmpty = lock.newCondition();
	private Condition isFull = lock.newCondition();
	private List<Object> internalList = new ArrayList<Object>();
	private Integer fillSize;
	public BlockingList(Integer maxFillSize){
		this.fillSize = maxFillSize;
	}
	
	public void put(Object object){
		try{
			lock.lock();
			while(internalList.size() >= fillSize){
				try {
					isFull.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
					return;
				}
			}
			
			internalList.add(object);
			isEmpty.signal();
			
		} finally {
			lock.unlock();
		}
	}
	
	public Object poll(){
		try{
			lock.lock();
			while(internalList.size() < 1){
				try {
					isEmpty.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
					return null;
				}
			}
			
			Object object = internalList.get(0);
			internalList.remove(0);
			isFull.signal();
			return object;
			
		} finally {
			lock.unlock();
		}
	}
}
