package com;

public class Partlist
{

	public static String[][] partlist(String[] arr)
	{
		String[][] newArray = new String[arr.length - 1][2];
		String arrayToString = String.join(" ", arr);
		int offSet = -1;
		for (int i = 0; i < arr.length - 1; i++)
		{
			offSet = arrayToString.indexOf(' ', offSet+1);
			newArray[i][0] = arrayToString.substring(0, offSet);
			newArray[i][1] = arrayToString.substring(offSet + 1, arrayToString.length());
		}
		return newArray;
	}
	public static void main(String[] args)
	{
		String[] s1 = {"az", "toto", "picaro", "zone", "kiwi"};
		System.out.println(s1);
		String[][] arr = partlist(s1);
		for (String[] s : arr) System.out.println(s[0] + " : " + s[1]);
		s1 = new String[] {"cdIw", "tzIy", "xDu", "rThG"};
		arr = partlist(s1);
		for (String[] s : arr) System.out.println(s[0] + " : " + s[1]);
		s1 = new String[] {"I", "wish", "I", "hadn't", "come"};
		arr = partlist(s1);
		for (String[] s : arr) System.out.println(s[0] + " : " + s[1]);
        s1 = new String[] {"vJQ", "anj", "mQDq", "sOZ"};
        arr = partlist(s1);
		for (String[] s : arr) System.out.println(s[0] + " : " + s[1]);
	}
}