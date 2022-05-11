package SplitString;


//time:4 ms
class Solution1
{
	public static String[] solution(String s) 
	{
        s = (s.length() % 2 == 0)?s:s+"_";
        /*
         * Regular expression here is interpreted as follows:
			(?<= is a Positive lookbehind.
			It matches a group before the main expression without including it in the result.	
			\G
			Previous match end.
			Matches the end position of the previous match.
			. Dot
			Matches any character except line breaks.
			{2} is a Quantifier.
			Matches 2 of the preceding token.
         */
        return s.split("(?<=\\G.{2})");
    }

}
