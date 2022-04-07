package com.zensar.java8;

import java.time.LocalDate;
import java.time.Period;

public class DateDemo {
     public static void main(String[] args) {
		
    	 
    	 LocalDate birthDate=LocalDate.of(1999, 07, 21);
    	 LocalDate currentDate=LocalDate.now();
    	 
    	 Period period= Period.between(birthDate, currentDate);
    	// System.out.println(period);
    	 
    	 System.out.println("You are "+period.getYears()+" Years and "+period.getMonths()+" Months and "+period.getDays()+" Days Old");
	}
}
