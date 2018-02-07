package com;

import java.util.*;

class SumDigPower
{
	// sum of powers
	public static List<Long> sumDigPow(long a, long b)
	{
		List<Long> powerList = new ArrayList();
		for (long i = a; i <= b; i++)
		{
			String theNumber = String.valueOf(i);
			int lengthOfNumber = theNumber.length();
			long sumOfPowers = 0;
			for (int o = 0; o < lengthOfNumber; o++)
			{
				sumOfPowers += Math.pow(Character.getNumericValue(theNumber.charAt(o)), o + 1);
			}
			if (i == sumOfPowers)
			{
				powerList.add(i);
			}
		}
		return powerList;
	}
	
	public static void main(String[] args)
	{
		System.out.println(sumDigPow(1, 10));
		System.out.println(sumDigPow(1, 100));
		System.out.println(sumDigPow(10, 100));
		System.out.println(sumDigPow(90, 150));
		System.out.println(sumDigPow(1, 2646798));
	}
}
