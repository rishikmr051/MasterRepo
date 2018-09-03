package com.soft.slk.training.generics;

public class ExampleOne {

	public static void main(String[] args) {
		FirstGenericClass<String> genericClassExample = new FirstGenericClass<String>("Test String");
		genericClassExample.showDetails();
		
		genericClassExample.showDetails(10);
		genericClassExample.showDetails("Another Test");
		genericClassExample.showDetails(true);
		genericClassExample.showDetails(10.115);
		genericClassExample.showDetails(10.115f);
		
//		FirstGenericClass.showDetails(10);
//		FirstGenericClass.showDetails("Another Test");
//		FirstGenericClass.showDetails(true);
//		FirstGenericClass.showDetails(10.115);
//		FirstGenericClass.showDetails(10.115f);
	}

}
