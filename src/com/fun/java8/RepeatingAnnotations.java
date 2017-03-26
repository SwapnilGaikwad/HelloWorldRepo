package com.fun.java8;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class RepeatingAnnotations {

	@Retention(RetentionPolicy.RUNTIME)
	@Target(ElementType.TYPE)
	public @interface Filters {
		Filter[] value();
	}

	@Retention(RetentionPolicy.RUNTIME)
	@Target(ElementType.TYPE)
	@Repeatable(Filters.class)
	public @interface Filter {
		String value();
	}

	@Filter(value = "filter1")
	@Filter(value = "filter2")
	public interface Filterable{
		
	}

	public static void main(String[] args) {
		for (Filter filter : Filterable.class.getAnnotationsByType(Filter.class)) {
			System.out.println(filter.value());
		}
	}

}
