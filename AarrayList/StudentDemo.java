package com.AarrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class StudentDemo {

	public static void main(String[] args) {
        ArrayList<Student> myList = new ArrayList<>();
        myList.add(new Student("Yash", 2, 85.25f));
        myList.add(new Student("Rohit", 3, 82.5f));
        myList.add(new Student("Aniket",1 ,55.20f));
//      System.out.println(myList.contains(new Student("Yash", 1, 85.25f)));
        Iterator<Student> iterator = myList.iterator();
        while (iterator.hasNext()) {
            Student temp = iterator.next();
            System.out.println(temp);
        }
        System.out.println(myList); 
        Collections.sort(myList,new SortByName());
        System.out.println(myList);
        Collections.sort(myList,new SortByRoll());
        System.out.println(myList);
    }
}
