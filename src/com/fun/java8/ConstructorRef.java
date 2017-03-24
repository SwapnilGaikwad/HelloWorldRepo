package com.fun.java8;


public class ConstructorRef {

	@FunctionalInterface
	interface Converter<F, T> {
	    T convert(F from);
	}

	public void testConstructorRef(){
		Converter<String, Integer> converter = Integer::valueOf;
		Integer value = converter.convert("1234");
		System.out.println("Answer : " + value);
	}

	public static void main(String[] args) {
		new ConstructorRef().testConstructorRef();
	}

}
