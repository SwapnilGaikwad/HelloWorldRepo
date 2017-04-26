package com.fun.jni;

public class JavaJNI {

	/*
	 * compilation:
	 * CLASSPATH=$PROJECT_HOME/target/classes javah com.fun.jni.JavaJNI
	 * g++ -I$JAVA_HOME/include -I$JAVA_HOME/include/linux  JavaJNI.c -shared -fPIC -o JavaJNI.so
	*/
	static{
		System.load("/home/sgaikwad/sandbox/java/javaSandbox/src/com/fun/jni/JavaJNI.so");
	}

	public native static void printHello();

	public native static double add(double a, double b);

	public static void main(String[] args) {
		JavaJNI.printHello();
		System.out.println("Answer: " + JavaJNI.add(10, 20));
	}

}
