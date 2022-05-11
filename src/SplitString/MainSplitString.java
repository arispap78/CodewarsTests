package SplitString;

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
