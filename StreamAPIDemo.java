package com.zensar.java8;

import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamAPIDemo {

	public static void main(String[] args) {
		List<String> names=new ArrayList<>();
		
		
		names.add("Virat");
		names.add("Rohit");
		names.add("Mahi");
		names.add("Ravindra");
		names.add("Sachin");
		
		/* List<String> namesStartWithR= new ArrayList<String>();
		 
		for(String name:names){
		if(name.startsWith("R")){
		namesStartWithR.add(name);
		}
		}
		System.out.println(namesWithR); */
		
		/*names.stream()
		.filter(name -> name.startsWith("R"))
		.forEach(name -> System.out.println(name));*/
		
	/*	List<String> namesWithR = names.stream()
				.filter(name -> name.startsWith("R"))
				.collect(Collectors.toList());
		System.out.println(namesWithR); */
		
	//	Stream<String> nameStream=names.stream();
	//	nameStream.forEach(c -> System.out.println(c));
		
		names.stream().forEach(c -> System.out.println(c));
	}

}
