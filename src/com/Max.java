package com;

public class Max
{
	public static int sequence(int[] arr)
	{
		if (arr.length == 0) return 0;
		int max = arr[0];
		int index = 1;
		for (int i = 0; i < arr.length; i++)
		{
			int sum = arr[i];
			for (int j = index; j < arr.length; j++)
			{
				if ((sum += arr[j]) > max)
				{
					max = sum;
				}
			}
			index++;
		}
		return max;
	}
	public static void main(String[] args)
	{
		System.out.println(Max.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
		// should be 6: {4, -1, 2, 1}
	}
}