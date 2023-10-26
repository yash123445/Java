package com.AarrayList;

import java.util.Comparator;

public class SortByRoll implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		return s1.rollNo - s2.rollNo;
	}

}
