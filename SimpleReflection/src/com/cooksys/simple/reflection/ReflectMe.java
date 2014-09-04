package com.cooksys.simple.reflection;

public class ReflectMe {
	
	@MyAnnotation("A String in my Annotation!")
	public String anAnnotatedMethod(String string){
		return string;
	}

}
