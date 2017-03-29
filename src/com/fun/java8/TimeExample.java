package com.fun.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class TimeExample {

	public static void main(String[] args) {

		Date oldJavaDate = new Date();
		LocalDate newJavaDate = LocalDate.now();
		LocalDateTime newJavaDateTime = LocalDateTime.now();
		
		System.out.println("Old Java date : " + oldJavaDate);
		System.out.println("New Java date : " + newJavaDate);
		System.out.println("Local Date time: " + newJavaDateTime);
		System.out.println("Local time in India: " + LocalDateTime.now(ZoneId.of("Asia/Kolkata")));
	}
}
