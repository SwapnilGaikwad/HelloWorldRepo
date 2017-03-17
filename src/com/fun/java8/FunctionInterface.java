package com.fun.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FunctionInterface {

	List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5, 6);

	private void evaluate(List<Integer> listOfInts, Predicate<Integer> predicate){
		for(Integer n : listOfInts){
			if(predicate.test(n)){
				System.out.println(n);
			}
		}
	}

	public void test(){
		System.out.println("Running with always true predicate...");
		evaluate(ints, val->true);
		
		System.out.println("Running with always false predicate...");
		evaluate(ints, test->false);
		
		System.out.println("Printing only even numbers...");
		evaluate(ints, val->val % 2 == 0);
	}
	public static void main(String[] args) {
		new FunctionInterface().test();
	}

}
