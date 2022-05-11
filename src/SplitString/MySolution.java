package SplitString;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
 * Complete the solution so that it splits the string into pairs of two characters. If the string contains an odd number 
 * of characters then it should replace the missing second character of the final pair with an underscore ('_')
 */

//time:2 ms

class MySolution 
{
	public static String[] solution(String s) 
	{
		//the size of the array will be the half of the length of the string
		int size=0;
		String splitS=new String();
		if(s.length()%2!=0) 
		{
			size=(s.length()+1)/2;
			splitS=s.concat("_");
		}
		else
		{
			size=s.length()/2;
			splitS=s;
		}
		String [] pairs=new String[size];
		System.out.println(size);
		for(int i=0;i<pairs.length;i++)
			pairs[i]=splitS.substring(2*i,2*i+2);
		System.out.println(splitS);	     
        return pairs;
    }
}
