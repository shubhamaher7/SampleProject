package com.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class sortStrings {
	static String SortString(String arr[],int size) {
		Arrays.sort(arr);
		for (int i=0;i<arr.length;i++) {
			System.out.println(" "+arr[1]);
		}
		return "";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of array");
		int size = sc.nextInt();
		String [] arr = new String [size];
		System.out.println("Enter The Strings");
		for (int i=0 ;i<arr.length;i++);
		{
		   arr[i]=sc.nextInt();
		}
		SortString(arr,size);
		
	}

}
