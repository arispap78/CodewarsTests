package VowelCount;

/*
 * Return the number (count) of vowels in the given string.
We will consider a, e, i, o, u as vowels for this Kata (but not y).
The input string will only consist of lower case letters and/or spaces.
 */

public class MainVowelCount
{
	public static void main(String[] args) 
	{
		long start=System.currentTimeMillis();
		int vowels=MySolution.getCount("papanastasiou");
		//int vowels=Solution2.getCount("papanastasiou");
		System.out.println(vowels);
		long end=System.currentTimeMillis();
		System.out.println(end-start+"ms");
		
	}

}
