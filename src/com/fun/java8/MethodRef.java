package com.fun.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MethodRef {

	static void calc(List<Integer> list, Function<Integer, Double> fun){
		for(int n : list){
			System.out.println(n + " -> " + fun.apply(n));
		}
	}

	public static void main(String[] args) {
		List<Integer>  numbers = Arrays.asList(4,9,16,25,36);
		System.out.println("Sqaures of numbers: ");
		MethodRef.calc(numbers, Math::sqrt);
		System.out.println("\nSin(x) of numbers: ");
		MethodRef.calc(numbers, Math::sin);
	}
}