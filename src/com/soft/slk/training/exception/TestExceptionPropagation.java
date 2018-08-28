package com.soft.slk.training.exception;

public class TestExceptionPropagation {

	void firstMethod() {  
		try {  
			secondMethod();  
		} catch(Exception e) {
			System.out.println("exception handled");
		}  
	}
	
	void secondMethod() {  
		thirdMethod();  
	}  
	
	void thirdMethod() {  
		int data=50/0;  
//		 throw new java.io.IOException("device error");//checked exception
	}  


	public static void main(String args[]){  
		TestExceptionPropagation obj=new TestExceptionPropagation();  
		obj.firstMethod();  
		System.out.println("normal flow...");  
	} 
}
