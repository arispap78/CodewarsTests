package VowelCount;

//time complexity:75 ms

class Solution5 
{
	public static int getCount(String str) 
	{
	     return (int)str.chars().mapToObj(i -> (char)i).filter(i -> "aeiou".contains(String.valueOf(i))).count();
	}

}
