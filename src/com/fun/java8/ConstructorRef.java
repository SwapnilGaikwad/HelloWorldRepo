package com.fun.java8;


public class ConstructorRef {

	@FunctionalInterface
	interface Converter<F, T> {
	    T convert(F from);
	}

	public void testConstructorRef(){
		Converter<String, Integer> converter = Integer::valueOf;
		Integer value = converter.convert("1234");
		System.out.println("Conversion answer : " + value);
		converter = ConstructorRef::length;
		value = converter.convert("1234");
		System.out.println("Length answer : " + value);
	}

	private static int length(String input){
		return input.length();
	}
	public static void main(String[] args) {
		new ConstructorRef().testConstructorRef();
	}

}
