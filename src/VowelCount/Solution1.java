package VowelCount;

class Solution1 
{
	public static int getCount(String str) 
	{
		//?i=enables case insensitive matching
		//^aeiou=matches any character NOT in the set {'a','e','i','o','u}
        return str.replaceAll("(?i)[^aeiou]", "").length();
    }

}
