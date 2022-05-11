package SmilingFaces;

import java.util.List;

class Solution2
{
	 public static int countSmileys(List<String> arr) 
	 {
	      return (int) arr.stream()
	        .filter(e -> e.matches("[:;][-~]?[\\)D]"))
	        .count();
	  }

}
