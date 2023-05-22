package com.array;

public class NumberModifier {
	public static int modifyNumber(int num) {
		String numStr = Integer.toString(num); // convert number to string to iterate over digits
		StringBuilder newNumStr = new StringBuilder();
		for (int i = 0; i < numStr.length() - 1; i++) {
			int digit1 = Character.getNumericValue(numStr.charAt(i));
			int digit2 = Character.getNumericValue(numStr.charAt(i + 1));
			int diff = Math.abs(digit1 - digit2); // absolute value of difference
			newNumStr.append(diff); // add new digit to new number string
		}
		newNumStr.append(numStr.charAt(numStr.length() - 1)); // add last digit as is
		return Integer.parseInt(newNumStr.toString()); // convert new number string back to integer
	}

	public static void main(String[] args) {
		int num = 45862;
		int modifiedNum = modifyNumber(num);
		System.out.println(modifiedNum); // prints "13242"
	}
}
