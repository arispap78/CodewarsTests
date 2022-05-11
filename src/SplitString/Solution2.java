package SplitString;

//time:4 ms
class Solution2
{
	public static String[] solution(String s) 
	{
	    return s.length() % 2 == 0 ? s.split("(?<=\\G.{2})") 
	      : (s + "_").split("(?<=\\G.{2})");
	}

}
