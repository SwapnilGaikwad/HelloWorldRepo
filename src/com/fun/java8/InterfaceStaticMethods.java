package com.fun.java8;

public class InterfaceStaticMethods {

	public static void main(String[] args) {
		Interface3.printMessage(" message content");
	}
}

interface Interface3 {
	static void printMessage(String msg){
		System.out.println("Interface3.printMessage() : " + msg);
	}
}
