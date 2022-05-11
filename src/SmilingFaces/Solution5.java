package SmilingFaces;

import java.util.List;

class Solution5 
{
	public static int countSmileys(List<String> arr) 
	{
	    return arr.stream().mapToInt( w -> w.matches("^[:;][-~]?[)D]$") ? 1 : 0 ).sum();
	}

}
