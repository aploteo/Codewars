package com;

class FindArrayOutlier
{
	public static int findTheOutlier(int[] array)
	{
		int outlier = 0;
		boolean lookForOdd = false;
		boolean lookForEven = false;
		boolean found = false;
		if (array[0] % 2 == 0 && array[1] % 2 == 0) lookForOdd = true;
		else if (array[0] % 2 != 0 && array[1] %2 != 0) lookForEven = true;
		else if ((array[0] % 2 != 0 && array[1] % 2 == 0 && array[2] % 2 == 0))
		{
			outlier = array[0];
			found = true;
		}
		else if (array[0] % 2 == 0 && array[1] % 2 != 0 && array[2] % 2 == 0)
		{
			outlier = array[1];
			found = true;
		}
		else if (array[0] % 2 == 0 && array[1] % 2 != 0 && array[2] % 2 != 0)
		{
			outlier = array[0];
			found = true;
		}
		else if (array[0] % 2 != 0 && array[1] % 2 == 0 && array[2] % 2 != 0)
		{
			outlier = array[1];
			found = true;
		}

		int i = 0;
		while (found == false && i < array.length)
		{
			if (lookForOdd)
			{
				if (array[i] % 2 != 0)
				{
					outlier = array[i];
					found = true;
				}
			}
			else
			{
				if (array[i] % 2 == 0)
				{
					outlier = array[i];
					found = true;
				}
			}
			i++;
		}
		return outlier;
	}

	public static void main(String[] args)
	{
		int[] array1 = new int[] { 2, 4, 0, 100, 4, 11, 2602, 36 };
		int[] array2 = new int[] { 3, 7, 1, 101, 4, 11, 2603, 37 };
		int[] array3 = new int[] { 3, 160, 1719, 19, 11, 13, -21 };
		int[] array4 = new int[] { 4, 163, 1710, 18, 12, 14, -22 };
		int outlier1 = findTheOutlier(array1);
		int outlier2 = findTheOutlier(array2);
		int outlier3 = findTheOutlier(array3);
		int outlier4 = findTheOutlier(array4);
		System.out.println(outlier1);
		System.out.println(outlier2);
		System.out.println(outlier3);
		System.out.println(outlier4);

	}
}