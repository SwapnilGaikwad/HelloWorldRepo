package com.fun.misc;

import java.io.IOException;

public class AsyncProc {

	public static void main(String[] args) {

		ProcessBuilder builder = new ProcessBuilder("src/com/fun/misc/script.sh");
		Process process = null;
		try {
			System.out.println("Before starting process....");
			process= builder.start();
			System.out.println("After starting process....");
			process.waitFor();
			System.out.println("After waiting for the process....");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
