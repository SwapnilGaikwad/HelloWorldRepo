package com.fun.java8;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Reflection {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		Method method = Reflection.class.getMethod("main", String[].class);
		for(final Parameter parameter : method.getParameters()){
			System.out.println("Parameter: " + parameter.getName());
		}
	}
}
