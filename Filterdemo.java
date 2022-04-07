package com.zensar.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filterdemo {
	
	
	public static void main(String[] args) {
		
	/*	ArrayList<Integer>numbersList=new ArrayList<Integer>();
		numbersList.add(25);
		numbersList.add(35);
		numbersList.add(45);
		numbersList.add(55);
		numbersList.add(65);  */
		
		List <Integer>numbersList=Arrays.asList(10,20,25,30,45);
		
		List<Integer>evenNumbersList=new ArrayList<Integer>();
		
		// numbersList.stream().filter(n -> n%2==0).forEach(n-> System.out.println(n)); 
		
		evenNumbersList=numbersList.stream().filter(n -> n%2==0).collect(Collectors.toList());
		
		System.out.println(evenNumbersList);
		
	}

}
