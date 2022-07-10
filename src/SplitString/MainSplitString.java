package SplitString;

/*
 * Complete the solution so that it splits the string into pairs of two characters. If the string contains an odd number 
 * of characters then it should replace the missing second character of the final pair with an underscore ('_')
 */

public class MainSplitString 
{
	public static void main(String[] args) 
	{
		long start=System.currentTimeMillis();
		//String[] splitString=MySolution.solution("asdfghjhytp");
		String[] splitString=Solution3.solution("asdfghjhytp");
		for(String a:splitString)
			System.out.println(a);
		long end=System.currentTimeMillis();
		System.out.println(end-start+" ms");
		
	}

}
