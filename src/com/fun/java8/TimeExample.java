package com.fun.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class TimeExample {

	public void testChronoUnits(){
		System.out.println("********************************************");
		LocalDate today = LocalDate.now();
		System.out.println("Today: " + today);
		System.out.println("Tomorrow: " + today.plus(1, ChronoUnit.DAYS));
		System.out.println("Next week: " + today.plus(1, ChronoUnit.WEEKS));
		System.out.println("Next month: " + today.plus(1, ChronoUnit.MONTHS));
		System.out.println("Next year: " + today.plus(1, ChronoUnit.YEARS));
		System.out.println("Next decade: " + today.plus(1, ChronoUnit.DECADES));
	}

	public static void main(String[] args) {

		Date oldJavaDate = new Date();
		LocalDate newJavaDate = LocalDate.now();
		LocalDateTime newJavaDateTime = LocalDateTime.now();
		
		System.out.println("Old Java date : " + oldJavaDate);
		System.out.println("New Java date : " + newJavaDate);
		System.out.println("Local Date time: " + newJavaDateTime);
		System.out.println("Local time in India: " + LocalDateTime.now(ZoneId.of("Asia/Kolkata")));
		
		new TimeExample().testChronoUnits();
	}
}
