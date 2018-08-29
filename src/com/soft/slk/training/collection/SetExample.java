package com.soft.slk.training.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		
		Set<String> hashSet = new HashSet<>();
		hashSet.add("First");
		hashSet.add("Another");
		hashSet.add("Last");
		
		Set<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("First");
		linkedHashSet.add("Another");
		linkedHashSet.add("Last");
		
		for(String str : hashSet) {
			System.out.println(str);
		}

		for(String str : linkedHashSet) {
			System.out.println(str);
		}
		
	}

}
