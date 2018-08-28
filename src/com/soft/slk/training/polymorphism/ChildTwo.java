package com.soft.slk.training.polymorphism;

public class ChildTwo extends Parent{
	private int value = 30;
	
	@Override
	public void printMethod() {
		System.out.println("Inside printMethod() of ChildTwo class");
	}
}
