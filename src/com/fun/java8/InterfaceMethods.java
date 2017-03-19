package com.fun.java8;

public class InterfaceMethods implements interface1, interface2{

	public static void main(String[] args) {
		InterfaceMethods obj = new InterfaceMethods();
		obj.printMessage(" message content");
	}

}

interface interface1 {
	default void printMessage(String msg){
		System.out.println("interface1.printMessage() : " + msg);
	}
}

interface interface2 {
	static void printMessage(String msg){
		System.out.println("interface2.printMessage(): " + msg);
	}
}