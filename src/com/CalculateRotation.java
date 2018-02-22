package com;

public class CalculateRotation
{
	static int shiftedDiff(String first, String second)
	{
		if (first.length() != second.length())
			return -1;// early kill
		second += second;
		return second.indexOf(first);
	}

	// public class CalculateRotation
	// {
	// static int shiftedDiff(String first, String second)
	// {
	// // Verify if strings are equal or have different lengths and return
	// corresponding values.
	// if (first.equals(second)) return 0;
	// else if (first.length() != second.length()) return -1;
	// // Use stringbuilder to facilitate string handling.
	// StringBuilder sb = new StringBuilder(second);
	// int rotation = 0;
	// for (int i = 0; i < sb.length() - 1; i++)
	// {
	// // Perform first rotation
	// sb.append(sb.charAt(0));
	// sb.deleteCharAt(0);
	// rotation++;
	// // Test equality.
	// if (sb.toString().equals(first))
	// {
	// return rotation;
	// }
	// }
	// // Return value for different strings.
	// return -1;
	// }

	public static void main(String[] args)
	{
		System.out.println(shiftedDiff("coffee", "eecoff")); // => 2
		System.out.println(shiftedDiff("eecoff", "coffee")); // => 4
		System.out.println(shiftedDiff("moose", "Moose")); // => nil
		System.out.println(shiftedDiff("isn't", "'tisn")); // => 2
		System.out.println(shiftedDiff("Esham", "Esham")); // => 0
		System.out.println(shiftedDiff("dog", "god")); // => nil
	}
}