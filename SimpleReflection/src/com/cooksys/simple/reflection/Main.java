package com.cooksys.simple.reflection;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	private ReflectMe reflectMe = new ReflectMe();
	
	public static void main(String[] args) {
		Main main = new Main();
		main.doThings();
		main.doCoolThings();
	}
	
	private void doCoolThings() {
		System.out.println(cool);
	}
	
	private void doThings(){
		
		Object object = reflectMe;
		
		Method[] methods = object.getClass().getMethods();
		
		System.out.println("All Methods");
		List<Method> methodList = new ArrayList<>();
		for(Method method : methods){
			System.out.println(method.getName());
			
			if(method.getAnnotation(MyAnnotation.class) != null){
				methodList.add(method);
			}
		}
		
		System.out.println("\n Methods with MyAnnotation");
		
		for(Method method : methodList){
			
			System.out.println(method.getName() + " : " + 
					method.getAnnotation(MyAnnotation.class).value());
		}
		
		
	}

}
