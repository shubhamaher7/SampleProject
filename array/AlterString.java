package com.array;

import java.util.Scanner;

public class AlterString {
	static boolean alterString(char character) {
		if (character != 'a' && character != 'e' && character != 'i' && character != 'o' && character != 'u') {
			return false;
		}
		return true;
	}

	static String stringreplacement (char [] string) {
		for (int i=0;i<string.length;i++) {
			if(alterString (string[i])) {
				if (string[i] == 'z') 
				{
                    string[i] = 'b';
                }
				else {
				string [i] = (char)(string[i] + 1);
				
				if (alterString(string[i])) {
                    string[i] = (char)( string[i] + 1);
			}
		}
			  
	}
}
		return String.valueOf(string);
	}

	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		String string = sc.next();
		System.out.println(stringreplacement(string.toCharArray()));

	}

}
