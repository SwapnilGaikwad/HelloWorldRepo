package com.fun.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams {

	private List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	public void testSequentialStreams(){
		Stream<Integer> sequentialStream = list.stream();
		printList(sequentialStream);
	}

	public void testParallelStreams() {
		Stream<Integer> parallelStream = list.parallelStream();
		printList(parallelStream);
	}

	private void printList(Stream<Integer> stream){
		stream.forEach(num -> System.out.print("'" + num + "' "));
		System.out.println();
	}

	public static void main(String[] args) {
		Streams obj = new Streams();
		System.out.println("Testing sequential stream: ");
		obj.testSequentialStreams();
		System.out.println("Testing parallel stream: ");
		obj.testParallelStreams();
	}
}
