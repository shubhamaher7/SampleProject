package com.array;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

//import jdk.vm.ci.meta.Local;

public class EmployeeInfo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the emp name");
		String name =sc.next();
		
		System.out.println("Enter the emp id ");
		String id =sc.next();
		
		System.out.println("Enter the date of joining in YYYY-MM-DD format");
		String doj = sc.nextLine();
		LocalDate date = LocalDate.parse(doj);
		
		System.out.println("Current Date");
		String currenDate = sc.nextLine();
		LocalDate currentDate =LocalDate.now();
		System.out.println(currentDate);
		
		// Calculate the number of years the employee has worked for the company
		Period Time = Period.between(doj, currentDate);
		int years =Time.getYears();
		
		//Displaying all info
		System.out.println(name);
		System.out.println(id);
		System.out.println(doj);
		System.out.println(Time);
	}

}
