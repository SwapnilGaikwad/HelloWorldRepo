package com.fun.java8;

public class LambdaExp {

	public static void main(String[] args) {
		SayMessage msg = (String message) -> System.out.println("Hello " + message);
		msg.sayHello("TestName");
	}

	private interface SayMessage {
		void sayHello(String message);
	}
}