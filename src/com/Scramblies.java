package com;

public class Scramblies
{

	public static boolean scramble(String str1, String str2)
	{
		if (str1.length() < str2.length()) return false;
		StringBuilder sb = new StringBuilder(str1);
		int foundLetters = 0;

		for (int i = 0; i < str2.length(); i++)
		{
			if (sb.indexOf(str2.substring(i, i + 1)) != -1)
			{
				sb.deleteCharAt(sb.indexOf(str2.substring(i, i+1)));
				foundLetters++;
			}
		}
		if (foundLetters == str2.length()) return true;
		else return false;
	}

	public static void main(String[] args)
	{
		System.out.println(Scramblies.scramble("rkqodlw", "world"));
		System.out.println(Scramblies.scramble("cedewaraaossoqqyt", "codewars"));
		System.out.println(Scramblies.scramble("katas", "steak"));
	}
}