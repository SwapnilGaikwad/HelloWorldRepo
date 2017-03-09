package com.fun.collection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class TestQueue {

	private Queue<Integer> queue;

	public void testLinkedListQueue(){
		queue = new LinkedList<Integer>();
		for(int i = 0; i < 10; i++){
			queue.add(i);
		}
		printQueue();
		System.out.println("Removed : " + queue.remove());
		printQueue();
		System.out.println("Removed : " + queue.remove());
		System.out.println("Removed : " + queue.remove());
		printQueue();
		queue.add(99);
		System.out.println("Added: " + 99);
		printQueue();
	}

	public void testPriorityQueue(){
		queue = new PriorityQueue<Integer>();
		for(int i = 0; i < 10; i++){
			queue.add(i);
		}
		printQueue();
		System.out.println("Removed : " + queue.remove());
		printQueue();
		System.out.println("Removed : " + queue.remove());
		System.out.println("Removed : " + queue.remove());
		printQueue();
		queue.add(99);
		System.out.println("Added: " + 99);
		printQueue();
	}

	private void printQueue(){
		System.out.print("Queue Status: ");
		for(Integer i : queue){
			System.out.print(" " + i);
		}
		System.out.println();
	}

	public static void main(String [] args){
		TestQueue testQueue = new TestQueue();
		System.out.println("Testing LinkedList based Queue: ");
		testQueue.testLinkedListQueue();
		System.out.println("\n\n\nTesting queue built on PriorityQueue: ");
		testQueue.testPriorityQueue();
	}
}
