package com.soft.slk.training.collection;

import java.util.ArrayList;

import com.google.common.collect.Lists;

public class ListExample {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Java");
		arrayList.add("REST");
		arrayList.add("SOAP");
		arrayList.add(".Net");
		arrayList.add("Spring");
		arrayList.add(1, "SAMPLE");
		System.out.println("arrayList.size() ----> " + arrayList.size() + " :: arrayList ----> " + arrayList);

//		ArrayList<String> childArrayList = new ArrayList<>();
		ArrayList<String> childArrayList = Lists.newArrayList("caching", "collection", "exception"); 
//		childArrayList.add("caching");
//		childArrayList.add("collection");
//		childArrayList.add("exception");
		arrayList.addAll(childArrayList);
		System.out.println("arrayList.size() ----> " + arrayList.size() + " :: arrayList ----> " + arrayList);

		String[] array = {"Array, ArrayList"};
		arrayList.addAll(Lists.newArrayList(array));		
		System.out.println("arrayList.size() ----> " + arrayList.size() + " :: arrayList ----> " + arrayList);
		
		arrayList.remove("SOAP");
		System.out.println("arrayList.size() ----> " + arrayList.size() + " :: arrayList ----> " + arrayList);

		arrayList.remove("SAMPLE");
		System.out.println("arrayList.size() ----> " + arrayList.size() + " :: arrayList ----> " + arrayList);
		
		arrayList.removeAll(childArrayList);
		System.out.println("arrayList.size() ----> " + arrayList.size() + " :: arrayList ----> " + arrayList);
	}

}
