package com.api.time;

import java.time.LocalDate;

public class LocalDateExample {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.parse("2022-10-09");
		
		System.out.println(date.getYear());
		System.out.println(date.getMonth());
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getDayOfWeek());
		System.out.println(date.getDayOfYear());
			
	}
}
