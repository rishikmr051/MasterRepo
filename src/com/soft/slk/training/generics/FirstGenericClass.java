package com.soft.slk.training.generics;

public class FirstGenericClass<Test> {
	private Test test;

	public FirstGenericClass(Test test) {
		this.test = test;
	}
	
	public void showDetails() { 
		System.out.println(test.getClass().getName() +
                " = " + test);
//		showDetails(test);
	}
	
	public static <GenericClass> void showDetails(GenericClass genericClassObject) {
		System.out.println(genericClassObject.getClass().getName() +
                " :: " + genericClassObject);
	}
	
}