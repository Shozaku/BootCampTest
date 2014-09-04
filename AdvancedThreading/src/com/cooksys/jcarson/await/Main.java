package com.cooksys.jcarson.await;

public class Main {
	
	private BlockingList list = new BlockingList(3);

	private void begin(){
		Runnable r = new Runnable(){
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " : Adding");
				list.put(new String("Test : " + Thread.currentThread().getName()));
				System.out.println(Thread.currentThread().getName() + " : Finished Adding");
			}
		};
		
		new Thread(r).start();
		new Thread(r).start();
		
		new Thread(r).start();
		new Thread(r).start();
		new Thread(r).start();
		
		try{
			Thread.sleep(5000);
			
			System.out.println(list.poll());
			Thread.sleep(500);
			
			System.out.println(list.poll());
			Thread.sleep(500);
			
			System.out.println(list.poll());
			Thread.sleep(500);
			
			System.out.println(list.poll());
			Thread.sleep(500);
			
			System.out.println(list.poll());
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Main main = new Main();
		main.begin();
	}

}
