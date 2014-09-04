package com.cooksys.jcarson.executorservice;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceExample {

	private ExecutorService executor = Executors.newCachedThreadPool();
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorServiceExample main = new ExecutorServiceExample();
		main.runCallable();
	}
	
	private void runCallable() throws InterruptedException, ExecutionException{
		CallableTask task1 = new CallableTask();
		
		Future<String> future = executor.submit(task1);
		
		System.out.println("Retrieved string : " + future.get());
		
		executor.shutdown();
		
		executor.awaitTermination(10,  TimeUnit.SECONDS);
	}
	
	private void runTasks() throws InterruptedException{
		ImportantTask task1 = new ImportantTask();
		ImportantTask task2 = new ImportantTask();
		ImportantTask task3 = new ImportantTask();
		
		executor.execute(task1);
		executor.execute(task2);
		executor.execute(task3);
		
		Thread.sleep(2500);
		
		executor.execute(task3);
		executor.execute(task3);
		
		executor.shutdown();
		
		executor.awaitTermination(10, TimeUnit.SECONDS);
	}

}
