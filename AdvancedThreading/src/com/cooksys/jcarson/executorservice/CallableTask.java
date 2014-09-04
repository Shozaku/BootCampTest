package com.cooksys.jcarson.executorservice;

import java.util.concurrent.Callable;

public class CallableTask implements Callable<String>{

	@Override
	public String call() throws Exception {
		System.out.println(Thread.currentThread().getName() + " : Sleeping");
		Thread.sleep(5000);
		return "A Called String";
	}

}
