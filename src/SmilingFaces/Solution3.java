package SmilingFaces;

import java.util.List;

class Solution3 
{
	public static int countSmileys(List<String> arr) 
	{
	     return (int) arr.stream().filter(s -> s.matches("^[:;][-~]?[)D]$")).count();
	}

}
