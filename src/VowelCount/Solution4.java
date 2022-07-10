package VowelCount;

//time complexity:8 ms

class Solution4 
{
	public static int getCount(String str) 
	{
	    return str.replaceAll("[^aeiou]","").length();
	}
}
