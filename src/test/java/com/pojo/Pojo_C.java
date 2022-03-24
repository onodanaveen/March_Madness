package com.pojo;

public class Pojo_C {
	public static void main(String[] args) {
		
		Pojo_A a = new Pojo_A();
		
		a.setAge(18);
		
		int age = a.getAge();
		
		System.out.println("Age is "+ age);
	}

}
