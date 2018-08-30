package com.soft.slk.training.collection;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

public class DemoHelper {
	
	public enum Gender{
		MALE, FEMALE
	}
	
	public static int getSumOfMaxAndMin(Map<Integer, String> map) {
		int sum = 0;
		
		Set<Integer> integerValuesUsingHash = getIntegerValuesUsingHashSet(map);
		Set<Integer> integerValuesUsingTree = getIntegerValuesUsingTreeSet(map);
		
		System.out.println(sum);
		return sum;
	}

	public static Set<Integer> getIntegerValuesUsingHashSet(Map<Integer, String> map) {
		List<String> values = Lists.newArrayList(map.values());
		
		Set<Integer> integerValues = Sets.newHashSet();
		for(String str : values) {
			try {
				Integer val = Integer.parseInt(str);
				integerValues.add(val);
			} catch (Exception e) {
				System.out.println("Exception while parsing " + str +" - " + e.getMessage());
			}
		}
		System.out.println("getIntegerValuesUsingHashSet() :: " + integerValues);
		return integerValues;
	}
	
	public static Set<Integer> getIntegerValuesUsingTreeSet(Map<Integer, String> map) {
		List<String> values = Lists.newArrayList(map.values());
		
		Set<Integer> integerValues = Sets.newTreeSet();
		for(String str : values) {
			try {
				Integer val = Integer.parseInt(str);
				integerValues.add(val);
			} catch (Exception e) {
				System.out.println("Exception while parsing " + str +" - " + e.getMessage());
			}
		}
		System.out.println("getIntegerValuesUsingTreeSet() :: " + integerValues);
		return integerValues;
	}
	
	
}
