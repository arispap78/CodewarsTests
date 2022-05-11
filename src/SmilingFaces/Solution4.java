package SmilingFaces;

import java.util.List;

class Solution4 
{
	public static int countSmileys(List<String> arr) 
	{
	    String validSmileRegExp = "[:;][-~]?[)D]";
	    int smiles = 0;
	    for (String smile : arr) 
	    {
	      if (smile.matches(validSmileRegExp)) 
	      {
	        smiles += 1; 
	      }
	    }
	    return smiles;
	  }

}
