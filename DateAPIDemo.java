package com.zensar.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateAPIDemo {
	public static void main(String[] args) {
		
		//LocalDate date=LocalDate.now();
		
		//System.out.println(date);
		
		/*LocalDate localDate= LocalDate.of(2022, 07, 21);
		localDate=localDate.plusYears(2);
		localDate=localDate.plusMonths(3);
		localDate=localDate.plusDays(4);
		System.out.println(localDate);*/
		
		//LocalTime time=LocalTime.now();
		//System.out.println(time);
		
		/*LocalTime time= LocalTime.of(12, 30, 50);
		time=time.plusHours(2);
		time=time.plusMinutes(23);
		time=time.plusSeconds(20);
		System.out.println(time);*/
		
		//LocalDateTime t=LocalDateTime.now();
		// System.out.println(t);
		
		LocalDateTime t= LocalDateTime.of(1997, 05, 19, 8, 8, 10);
		t=t.plusYears(2);
		t=t.plusMonths(2);
		t=t.plusDays(2);
		t=t.plusHours(2);
		t=t.plusMinutes(2);
		t=t.plusSeconds(10);
		System.out.println(t);
	}

}
