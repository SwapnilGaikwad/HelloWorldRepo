package com.fun.java8;

public class InterfaceDefaultMethods implements interface1, interface2{

	public void printMessage(String msg){
		System.out.println("InterfaceMethods.printMessage()" + msg);
	}

	public static void main(String[] args) {
		InterfaceDefaultMethods obj = new InterfaceDefaultMethods();
		obj.printMessage(" message content");
	}

}

interface interface1 {
	default void printMessage(String msg){
		System.out.println("interface1.printMessage() : " + msg);
	}
}

interface interface2 {
	default void printMessage(String msg){
		System.out.println("interface2.printMessage(): " + msg);
	}
}