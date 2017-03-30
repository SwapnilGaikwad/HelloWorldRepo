package com.fun.java8;

import java.util.Optional;

public class OptionalClass {

	public int sum(Optional<Integer> a, Optional<Integer> b) {
		System.out.println("\nIs first arg present: " + a.isPresent());
		System.out.println("Is second arg present: " + b.isPresent());
		int sum = a.orElse(new Integer(0)) + b.orElse(new Integer(0));
		System.out.println("Sum is : " + sum);
		return sum;
	}
	public static void main(String[] args) {

		Optional<Integer> nullVal = Optional.ofNullable(null);
		Optional<Integer> ten = Optional.of(10);
		Optional<Integer> five = Optional.of(5);
		
		OptionalClass obj = new OptionalClass();
		obj.sum(nullVal, ten);
		obj.sum(five, nullVal);
		obj.sum(nullVal, nullVal);
	}

}
