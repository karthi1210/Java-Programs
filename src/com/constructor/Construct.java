package com.constructor;

public class Construct {
	//whenever object created, constructor invoked automatically
	public Construct() {
		this(10);
		System.out.println("Default constructor");
	}
	public Construct(int age) {
		this("karthik");
		System.out.println("Parameterized constructor");
		System.out.println(age);
	}
	public Construct(String name) {
		this("Sofia",8489909999l);
		System.out.println("String");
		System.out.println(name);
	}
	public Construct(String s,long k) {
		System.out.println("String & Long");
		System.out.println(s+" "+k);
	}
	
	public static void main(String[] args) {
		new Construct();
		}
}
