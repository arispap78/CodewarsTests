package Multiples3or5;

public class MainMultiples3or5 
{
	public static void main(String [] args) 
	{
		long start=System.currentTimeMillis();
		//int sum=Solution4.solution(1000000);
		//int sum=MySolution.solution(1000000);
		int sum=Solution3Math.solution(1000);
		System.out.println(sum);
		long end=System.currentTimeMillis();
		System.out.println(end-start+" ms");
	}
}
