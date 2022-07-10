package VowelCount;

//time complexity:80 ms

class Solution3 
{
	 public static int getCount(String str) 
	 {
		 //indexOf(ch) returns -1 if the value ch is not found in the string ("aeiou" in this case), else it will return the position
	    return (int) str.chars().filter(c -> "aeiou".indexOf(c) >= 0).count();
	 }

}
