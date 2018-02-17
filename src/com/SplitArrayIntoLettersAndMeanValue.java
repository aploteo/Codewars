package com;

public class SplitArrayIntoLettersAndMeanValue
{
	public static Object[] mean(char[] lst)
	{
		StringBuilder sb = new StringBuilder(String.valueOf(lst));
		int sumOfNumbers = 0;
		int i = 0;
		while (i < sb.length())
		{
			if (Character.isDigit(sb.charAt(i)))
			{
				sumOfNumbers += Character.getNumericValue(sb.charAt(i));
				sb.deleteCharAt(i--);
			}
			i++;
		}
		return new Object[] {sumOfNumbers / 10d, sb.toString()};
	}
	
	public static void main(String[] args)
	{
		char[] lst = new char[] {'u', '6', 'd', '1', 'i', 'w', '6', 's', 't', '4', 'a', '6', 'g', '1', '2', 'w', '8', 'o', '2', '0'};
		Object[] test = mean(lst);
		System.out.println(test[0]);
		System.out.println(test[1]);
	}
} 