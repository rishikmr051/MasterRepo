package com.soft.slk.training.typepromotion;

public class FirstExample {
	
	void disp(int a, double b){
		System.out.println("Method A");
	}
	
	void disp(int a, double b, double c){
		System.out.println("Method B");
	}
	
	public static void main(String args[]){
		FirstExample obj = new FirstExample();
		obj.disp(100, 20.67f);
	}
	
}
