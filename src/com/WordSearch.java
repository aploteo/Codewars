package com;

import java.util.ArrayList;
import java.util.List;

class WordSearch
{
	static String[] findWord(String x, String[] y)
	{
		List<String> foundWords = new ArrayList();
		for (int i = 0; i < y.length; i++)
		{
			if (y[i].toLowerCase().contains(x))
			{
				foundWords.add(y[i]);
			}
		}
		return foundWords.size() > 0 ? foundWords.toArray(new String[0]) : new String[] {"Empty"};
	}
	
	public static void main(String[] args)
	{
		String[] y = {"lemonade", "limeade", "Yoo-Hoo", "root beer", "grapeade ", "water", "Mr. Pibb"};
		String[] newArray = findWord("ade", y);
		System.out.println(newArray[0]);
		System.out.println(newArray[1]);
		System.out.println(newArray[2]);
	}
}

//class WordSearch
//{
//	static String[] findWord(String x, String[] y)
//	{
//		final String xLower = x.toLowerCase();
//		String[] searchResults = Arrays.stream(y).filter(s -> s.toLowerCase().contains(xLower))
//				.toArray(size -> new String[size]);
//		return searchResults.length > 0 ? searchResults : new String[] { "Empty" };
//	}
//
//	public static void main(String[] args)
//	{
//		String[] y = { "lemonade", "limeade", "Yoo-Hoo", "root beer", "grapeade ", "water", "Mr. Pibb" };
//		String[] newArray = findWord("ade", y);
//		System.out.println(newArray[0]);
//		System.out.println(newArray[1]);
//		System.out.println(newArray[2]);
//	}
//}