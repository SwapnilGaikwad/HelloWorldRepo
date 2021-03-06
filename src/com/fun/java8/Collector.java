package com.fun.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collector {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("str1", "str2", "str3", "str4", "str5", "str30", "str31");
		List<String> filteredString = strings.stream().filter(str -> str.contains("str3")).collect(Collectors.toList());
		filteredString.forEach(str -> System.out.println("Found - " + str));
	}

}
