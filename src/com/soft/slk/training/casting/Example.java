package com.soft.slk.training.casting;

public class Example {

	public static void main(String[] args) {
		String string1 = "Some value";
		Object object1 = string1;
		System.out.println(string1 + " : " + object1);
		
		
		Object object2 = "Some value again";
		String string2 = (String) object2;
		System.out.println(object2 + " : " + string2);
	}

}
