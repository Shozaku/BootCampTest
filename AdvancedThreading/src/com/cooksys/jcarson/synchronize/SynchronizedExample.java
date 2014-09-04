package com.cooksys.jcarson.synchronize;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SynchronizedExample {

	private List<String> listOfStrings = new ArrayList<String>();

	private Lock lock = new ReentrantLock();
	
	public SynchronizedExample(){
		int i = 0;
		while (i++ < 100){
			listOfStrings.add(new Integer(i).toString());
		}
	}
	
	public List<String> getListOfStrings(){
		return listOfStrings;
	}

	/**
	 * @return the lock
	 */
	public Lock getLock() {
		return lock;
	}

	public void withSynchronize() throws InterruptedException {
		synchronized (listOfStrings) {
			Iterator<String> iterator = listOfStrings.iterator();

			while (iterator.hasNext()) {
				System.out.println(iterator.next());
				Thread.sleep(10);
			}
		}
	}

	public void withReentrantLock() throws InterruptedException {

		try {
			lock.lock();

			Iterator<String> iterator = listOfStrings.iterator();

			while (iterator.hasNext()) {
				System.out.println(iterator.next());
				Thread.sleep(10);
			}
		} finally {
			lock.unlock();
		}
	}

	public void withoutThreadSafety() throws InterruptedException {
		Iterator<String> iterator = listOfStrings.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			Thread.sleep(10);
		}
	}
}
