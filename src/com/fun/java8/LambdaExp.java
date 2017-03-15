package com.fun.java8;

public class LambdaExp {

	private interface SayMessage {
		void sayHello(String message);
	}

	public void testLambda(){
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Executing for anonymous implementation of runnable r1");
			}
		};
		
		Runnable r2 = () -> System.out.println("Executing for lambda implementation of runnable r2");
		r1.run();
		r2.run();
	}

	public static void main(String[] args) {
		SayMessage msg = (String message) -> System.out.println("Hello " + message);
		msg.sayHello("TestName");
		
		LambdaExp obj = new LambdaExp();
		obj.testLambda();
	}
}