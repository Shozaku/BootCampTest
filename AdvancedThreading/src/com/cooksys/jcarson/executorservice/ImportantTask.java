package com.cooksys.jcarson.executorservice;

public class ImportantTask implements Runnable {

	@Override
	public void run() {
		
		try {
			System.out.println("1 " + Thread.currentThread().getName());
			Thread.sleep(500);
			System.out.println("2 " + Thread.currentThread().getName());
			Thread.sleep(500);
			System.out.println("3 " + Thread.currentThread().getName());
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
