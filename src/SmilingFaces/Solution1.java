package SmilingFaces;

import java.util.List;

class Solution1 
{
	public static int countSmileys(List<String> arr)
	{
	   return (int)arr.stream().filter( x -> x.matches("[:;][-~]?[)D]")).count();   
	}

}
