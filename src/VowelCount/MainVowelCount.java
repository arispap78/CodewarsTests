package VowelCount;

public class MainVowelCount
{
	public static void main(String[] args) 
	{
		long start=System.currentTimeMillis();
		//int vowels=MySolution.getCount("papanastasiou");
		int vowels=Solution5.getCount("papanastasiou");
		System.out.println(vowels);
		long end=System.currentTimeMillis();
		System.out.println(end-start+"ms");
		
	}

}
