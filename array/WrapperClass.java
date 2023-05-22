package com.array;

public class WrapperClass {

	public static void main(String[] args) {
		int i=21;
		float j=21.6F;
		double k=24.6;
		long p=24;
		char a='c';
		//UnBoxing 
		
		Integer intobj = Integer.valueOf(i);
		Float floatobj = Float.valueOf(j);
		double doubleobj= Double.valueOf(k);
		long Longobj= Long.valueOf(p);
		Character charobj=Character.valueOf(a);
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(p);
		System.out.println(a);
	}

}
