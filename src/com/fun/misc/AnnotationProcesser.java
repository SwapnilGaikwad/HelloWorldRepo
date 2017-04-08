package com.fun.misc;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;


@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface TestAnnotation {
	String name() default "defaultName";
	int revision() default 1;
}

class SimpleAnnotation {

	@Override
	@TestAnnotation(name="testName", revision=5)
	public String toString(){
		return  "SimpleAnnotation to string method";
	}
}

public class AnnotationProcesser {
	
	public static void main(String[] args) throws SecurityException, ClassNotFoundException{
		ClassLoader classLoader = AnnotationProcesser.class.getClassLoader();
		for(Method method: classLoader.loadClass("com.fun.misc.SimpleAnnotation").getMethods()){
			for(Annotation annotation : method.getDeclaredAnnotations()){
				System.out.println("Annotation: " + annotation);
				TestAnnotation testAnnotation = method.getAnnotation(TestAnnotation.class);
				System.out.println("Revision: " + testAnnotation.revision());
				System.out.println("Name: " + testAnnotation.name());}
		}
	}
}