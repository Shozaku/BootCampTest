package com.cooksys.jcarson.deadlock;

public class DeadlockThread implements Runnable{

	private Object lockableObject;
	
	public boolean loop = true;
	
	public DeadlockThread(Object lockableObject){
		this.lockableObject = lockableObject;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		synchronized(lockableObject){
			while(loop){
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	

}
