package com.cooksys.jcarson.deadlock;

public class Main {
	
	private Object lock = new Object();
	
	private DeadlockThread dThread = new DeadlockThread(lock);
	
	public void causeDeadlock() throws InterruptedException{
		
		new Thread(dThread).start();
		
		Thread.sleep(100);
		System.out.println("Begin");
		synchronized(lock){
			dThread.loop = false;
		}
		System.out.println("End");
		
	}

	public static void main(String[] args) throws InterruptedException {
		Main main = new Main();
		
		main.causeDeadlock();
	}

}
