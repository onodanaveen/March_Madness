package com.pojo;

public class Pojo_B {
	public static void main(String[] args) {
		
		Pojo_A a = new Pojo_A();
		
		int age = a.getAge();
		
		System.out.println("Age is "+age);
		
		a.setAge(12);
		
		System.out.println("After Setters");
		
		int age2 = a.getAge();
		
		System.out.println("Age is "+ age2);
	}
}
