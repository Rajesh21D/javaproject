package com.zensar.java8;

public class TestClass implements MyInterface1,MyInterface2{
	
	
	public void display() {
		MyInterface1.super.display();
		MyInterface2.super.display();
		
		System.out.println("my own Impl !!");
		
	}

	public static void main(String[] args) {
		TestClass t=new TestClass();
		
		t.display();
	}
	
  System.out.println("Hii")
}
