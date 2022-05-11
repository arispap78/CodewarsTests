package VowelCount;

class Solution4 
{
	public static int getCount(String str) 
	{
	    return str.replaceAll("[^aeiou]","").length();
	}
}
