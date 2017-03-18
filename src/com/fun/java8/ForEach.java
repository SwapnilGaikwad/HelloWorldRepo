package com.fun.java8;

import java.util.Arrays;
import java.util.List;

public class ForEach {

	public void simpleForEach(List<Integer> list){
		System.out.print("\nList contents: ");
		for (Integer integer : list) {
			System.out.print(integer + " ");
		}
	}

	public void java8ForEach(List<Integer> list){
		System.out.print("\nList contents: ");
		list.forEach((val) -> System.out.print(val + " "));
	}

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList( 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		ForEach obj = new ForEach();
		obj.simpleForEach(list);
		obj.java8ForEach(list);
	}

}
