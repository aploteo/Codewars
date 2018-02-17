package com;

import java.util.ArrayList;
import java.util.List;

public class EnoughIsEnough {

	public static int[] deleteNth(int[] elements, int maxOcurrences) {
		List<Integer> array1 = new ArrayList<>();
		List<Integer> array2 = new ArrayList<>();
		List<Integer> resultArray = new ArrayList<>();
		for (int i = 0; i < elements.length; i++)
		{
			if (!array1.contains(elements[i]))
			{
				array1.add(elements[i]);
				array2.add(1);
				resultArray.add(elements[i]);
			}
			else
			{
				if (array2.get(array1.indexOf(elements[i])) < maxOcurrences)
				{
					array2.set(array1.indexOf(elements[i]), array2.get(array1.indexOf(elements[i])) + 1);
					resultArray.add(elements[i]);
				}
			}
		}
		int[] finalArray = new int[resultArray.size()];
		for (int i = 0; i < resultArray.size(); i++)
		{
			finalArray[i] = resultArray.get(i);
		}
		return finalArray;
	}
	public static void main(String[] args)
	{
		int[] a = EnoughIsEnough.deleteNth(new int[] {20,37,20,21}, 1); // return [20,37,21]
		for (int i : a) System.out.println(i);
		a = EnoughIsEnough.deleteNth(new int[] {1,1,3,3,7,2,2,2,2}, 3); // return [1, 1, 3, 3, 7, 2, 2, 2]
		for (int i : a) System.out.println(i);
	}
}