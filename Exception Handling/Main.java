package com.Exception;

import java.util.Scanner;

public class Main {
	
	public static int divider(int a,int b)throws ArithmeticException {
		if( b==0)
			throw new ArithmeticException("Can't divide by the Zero");
		return a/b;
	}

	
	public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
      
          System.out.println("Enter the no 1: ");
          int a = sc.nextInt();
          System.out.println("Enter the no 2: ");
          int b = sc.nextInt();
          
          int c ;
          try {
        	  c = divider(a,b);
        	  System.out.println("The division  is: "+ c);
          }catch(ArithmeticException e) {
        	  e.printStackTrace();
        	  System.out.println(e.getMessage());
          }
          
          
          sc.close();
	}

}
