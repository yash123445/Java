package com.AarrayList;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<>();
		myList.add("John");
		myList.add("Yash");
		myList.add(1,"Rohit");
		System.out.println(myList);
		System.out.println(myList.contains("Yash"));
		System.out.println(myList.get(1)); 
		System.out.println(myList.indexOf("Yash"));
		System.out.println(myList.remove(0));
		System.out.println(myList.size());
		myList.clear();
		System.out.println(myList);
	}
}
