package com.cooksys.jcarson.synchronize;

public class IterateTask implements Runnable {

	private SynchronizedExample synch;
	
	public IterateTask(SynchronizedExample synch){
		this.synch = synch;
	}
	
	@Override
	public void run() {
		try {
			synch.withReentrantLock();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
