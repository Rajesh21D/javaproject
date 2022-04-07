package com.zensar.java8;

public interface Greeting {
	
	public void greet(String name);
	
}
/*class GreetingImpl implements Greeting{

	@Override
	public void greet(String name) {
		System.out.println("Good Morning "+name);
		
	}
	
	

}*/

class Test{
	public static void main(String[] args) {
		/*Greeting greeting=new Greeting() {

			@Override
			public void greet(String name) {
				System.out.println(" Hello "+name);
				
			}
			
		};
		
		greeting.greet("Rajesh");*/
		Greeting greeting=(String name) -> {
			System.out.println(" Hello "+name);
		};
		
		greeting.greet("Raju");
		
	}
}