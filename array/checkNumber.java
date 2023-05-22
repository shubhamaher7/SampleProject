package com.array;

import java.util.Scanner;

public class checkNumber {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		num= sc.nextInt();
		if ((num!=0)&&((num & (num-1))==0))
		System.out.println("the number is power of two");
		else
		System.out.println("Not power of two");
	}

}
