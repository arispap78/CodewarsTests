package SplitString;

//time:1 ms

class Solution3 
{
	public static String[] solution(String givenString) 
	{
	    givenString += givenString.length() % 2 != 0 ?  "_" : ""; 
	    String [] splitedStringArray = new String[givenString.length()/2];
	    for (int i = 0 , iOfGivenString = 0 ; i < splitedStringArray.length; i++, iOfGivenString += 2) 
	    {
	      splitedStringArray [i] = givenString.substring(iOfGivenString, iOfGivenString+2);
	    }    
	    return splitedStringArray;      
	 }
}
