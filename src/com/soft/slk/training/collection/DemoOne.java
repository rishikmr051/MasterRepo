package com.soft.slk.training.collection;

import java.util.Map;

import com.google.common.collect.Maps;

public class DemoOne {

	public static void main(String[] args) {
		Map<Integer, String> map = Maps.newHashMap();
		map.put(10, "Ten");
		map.put(1, "8");
		map.put(2, "200");
		map.put(0, null);
		map.put(4, "0.05");
		map.put(3, "12/7");
		map.put(6, "12");
		map.put(7, "10f");
		map.put(8, "20");
		map.put(9, "18");
		
		DemoHelper.getSumOfMaxAndMin(map);
		
	}
	
}
