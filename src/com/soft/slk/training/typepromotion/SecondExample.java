package com.soft.slk.training.typepromotion;

public class SecondExample {
	
	void disp(int a, double b){
		System.out.println("invoked : disp(int a, double b)");
	}
	
	void disp(int a, double b, double c){
		System.out.println("invoked : disp(int a, double b, double c)");
	}
	
	void disp(int a, float f){
		System.out.println("invoked : disp(int a, float f)");
	}
	
	void disp(int a, int f){
		System.out.println("invoked : disp(int a, int f)");
	}
	
	public static void main(String args[]){
		byte a = 100;
		SecondExample obj = new SecondExample();
		obj.disp(100, 20.67f);
		obj.disp(50, a);
	}
	
}
