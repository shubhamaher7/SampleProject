package com.array;



import java.util.regex.*;

public class MobileNumber
{
	public static boolean isValidMobileNo(String str) 
	{
		Pattern ptrn = Pattern.compile("[0-9]{10}");
		Matcher match = ptrn.matcher(str);
		return (match.find() && match.group().equals(str));
	}

	public static void main(String args[])
 {
            String str = "9800088899";
            if(isValidMobileNo(str))
 System.out.println("It is a valid mobile number.");
 else
            System.out.println("Entered mobile number is invalid.");
}

}