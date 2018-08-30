package com.soft.slk.training.collection;

import java.util.Collections;
import java.util.List;

import org.apache.commons.collections4.comparators.ComparatorChain;

import com.google.common.collect.Lists;
import com.soft.slk.training.collection.DemoHelper.Gender;

public class DemoTwo {

	public static void main(String[] args) {
		List<Student> students = Lists.newArrayList(
				new Student("Govind", 18, Gender.MALE),
				new Student("Deepa", 17, Gender.FEMALE),
				new Student("Shyam", 12, Gender.MALE),
				new Student("Deepak", 27, Gender.MALE),
				new Student("Radha", 10, Gender.FEMALE), 
				new Student("Geeta", 22, Gender.FEMALE)
				);
		
		for(Student student : students) {
			System.out.println(student.toString());
		}
		
		ComparatorChain<Student> chain = new ComparatorChain<>(new GenderComparator());
		chain.addComparator(new StudentAgeComparator());
		
		Collections.sort(students, chain);
		
//		Collections.sort(students, new StudentAgeComparator());
//		Collections.sort(students, new GenderComparator());
		
		for(Student student : students) {
			System.out.println(student.toString());
		}
	}

}
