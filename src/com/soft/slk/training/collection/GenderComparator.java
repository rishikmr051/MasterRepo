package com.soft.slk.training.collection;

import java.util.Comparator;

public class GenderComparator implements Comparator<Student>{

	@Override
	public int compare(Student student1, Student student2) {
		return student1.getGender().name().compareTo(student2.getGender().name());
	}
	
}