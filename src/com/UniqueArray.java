package com;

import java.util.*;

public class UniqueArray
{
	public static int[] unique(int[] integers)
	{
		List<Integer> tempArray = new ArrayList<>();
		for (int i = 0; i < integers.length; i++)
		{
			if (!tempArray.contains(integers[i]))
			{
				tempArray.add(integers[i]);
			}
		}
		int[] newIntegers = tempArray.stream().mapToInt(i->i).toArray();
		return newIntegers;
	}
	public static void main(String[] args)
	{
		int[] integers = new int[]{1, 2, 3, 3, 2, 1, 2, 3, 1, 1, 3, 2};
		unique(integers);
		for (int i : integers) System.out.print(i + " ");
		System.out.println();
		integers = unique(integers);
		for (int i : integers) System.out.print(i + " ");
	}
}