package com.fun.java8;

import java.time.LocalDate;
import java.util.Date;

public class TimeExample {

	public static void main(String[] args) {

		Date oldJavaDate = new Date();
		LocalDate newJavaDate = LocalDate.now();
		
		System.out.println("Old Java date : " + oldJavaDate);
		System.out.println("New Java date : " + newJavaDate);
	}
}
