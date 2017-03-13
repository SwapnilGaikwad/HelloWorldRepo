package com.fun.java8;

import java.util.Arrays;
import java.util.List;

public class MethodRef {

	public static void main(String[] args) {
		List<Integer>  numbers = Arrays.asList(4,9,16,25,36);
		numbers.forEach(System.out::println);
	}
}