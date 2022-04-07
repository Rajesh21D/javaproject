package com.zensar.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
		
		
		
		String name="rajesh";
		
		Optional<String> of=Optional.ofNullable(name);
		of.ifPresent(e -> System.out.println(e.toUpperCase()));
		
		of.orElseThrow(() ->{
			return new RuntimeException("Name not found");
		});
		
		
		
	/*	List<String> a=Arrays.asList("a","b","c","d");
		List<String> b=Arrays.asList("e","f","g","h");
		List<String> c=Arrays.asList("i","j","k","l");
		
		List<List<String>> alpha=new ArrayList<List<String>>();
		
		alpha.add(a);
		alpha.add(b);
		alpha.add(c);
		
		List<String> collect = alpha.stream().flatMap(element -> element.stream()).collect(Collectors.toList());
		System.out.println(collect); */
		
		
	/*	List<String> names=Arrays.asList("Rajesh","Mobeen","Pavan","Ram");
		
		List<String> namesToUpperCase= names.stream()
				.map(name -> name.toUpperCase())
				.collect(Collectors.toList());
		
		System.out.println(namesToUpperCase); */
		
	/*	List<Employee> employees=new ArrayList<Employee>();
		
		employees.add(new Employee(1002,"Rajesh",22000));
		employees.add(new Employee(1003,"Mobeen",25000));
		employees.add(new Employee(1004,"Rohith",27000));
		employees.add(new Employee(1006,"Arjun",29000));
		employees.add(new Employee(1005,"Pavan",32000));
		employees.add(new Employee(1007,"Venky",43000));
		
		employees.stream().map(employee -> employee.getEmployeeSalary()+1000).forEach(e -> System.out.println(e));
		
		
	/*	employees.stream()
		.filter((e)-> e.getEmployeeId()>=1004)
        .forEach(System.out::println); */
		
		/* employees.stream()
		.filter((e)-> e.getEmployeeSalary()>=30000)
        .forEach(e-> System.out.println(e)); */
		
		/* Comparator<Employee> empComparator=(Employee e1,Employee e2)->{
			return e1.getEmployeeName().compareTo(e2.getEmployeeName());
		};
		
		Collections.sort(employees,empComparator);*/
		
		//Collections.sort(employees,Comparator.comparing(Employee::getEmployeeSalary));
		
	//	Collections.sort(employees,Comparator.comparing(Employee::getEmployeeSalary).reversed());
	//	System.out.println(employees);
		
		
	/*	int []a= {4, 3, 7, 1, 9, 6};
		
		
		IntStream stream =Arrays.stream(a);
		
		stream.sorted().forEach(c -> System.out.println(c));
		
		System.out.println(" Reverse order");
		
		IntStream stream2 =Arrays.stream(a);
		
		List<Integer> collect = stream2.boxed()
		.sorted(Comparator.reverseOrder())
		.collect(Collectors.toList());
		System.out.println(collect); */
		
		/* int min=a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println(min); */
	
		
		// String []names= {"Raju","Ram","Ravan"};
		
		/* for(int i=0;i<a.length;i++){
		  System.out.println(a[i]);} */
		 
		
		//IntStream stream = Arrays.stream(a);
		//stream.forEach(i -> System.out.println(i));
		
	/*	Stream<String> stream= Arrays.stream(names);
		
		stream.forEach(t -> System.out.println(t));
		
		IntStream.iterate(1, n->n+1)
		.limit(10)
		.forEach(i-> System.out.println(i)); */
	}

}
