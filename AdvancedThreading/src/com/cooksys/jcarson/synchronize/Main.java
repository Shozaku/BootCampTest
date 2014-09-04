package com.cooksys.jcarson.synchronize;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		SynchronizedExample synch = new SynchronizedExample();
		IterateTask task = new IterateTask(synch);
		
		new Thread(task).start();
		Thread.sleep(100);
		try{
			synch.getLock().lock();
			System.out.println("Removing number 20");
			synch.getListOfStrings().remove(20);
		} finally {
			synch.getLock().unlock();
		}

	}
}
