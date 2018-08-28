package com.soft.slk.training.polymorphism;

public class Test {

	public static void main(String[] args) {
		// object of type Parent
        Parent a = new Parent();
 
        // object of type ChildOne
        ChildOne b = new ChildOne();
 
        // object of type ChildTwo
        ChildTwo c = new ChildTwo();
 
        // obtain a reference of type Parent
        Parent ref;
         
        // ref refers to an Parent object
        ref = a;
 
        // calling Parent's version of printMethod()
        ref.printMethod();
 
        // now ref refers to a ChildOne object
        ref = b;
 
        // calling ChildOne's version of printMethod()
        ref.printMethod();
 
        // now ref refers to a ChildTwo object
        ref = c;
 
        // calling ChildTwo's version of printMethod()
        ref.printMethod();
	}

}
