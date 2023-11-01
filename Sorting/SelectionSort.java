package com.Prcatice;

import java.util.Scanner;

public class SelectionSort {
	public static void selectionSort(int[] arr) {
		int len = arr.length;
		for(int i=0;i<len-1;i++) {
			int min = i;
			for(int j=i+1;j<len;j++) {
				if(arr[j]<arr[min]) {
					min= j;
				}
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;	
			}
		}
	}
	static void printArray(int a[]) {
		int len = a.length;
		for(int i =0;i<len;i++) {
			System.out.print(a[i] +" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array: ");
		int n = sc.nextInt();
		int [] a = new int[n];
		System.out.println("Enter the no. :" );
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		selectionSort(a);
		printArray(a);
	}

}
