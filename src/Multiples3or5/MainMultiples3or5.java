package Multiples3or5;

/*
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.
Additionally, if the number is negative, return 0 (for languages that do have them).

Note: If the number is a multiple of both 3 and 5, only count it once.
 */

public class MainMultiples3or5 
{
	public static void main(String [] args) 
	{
		long start=System.currentTimeMillis();
		int sum=Solution2.solution(1000000);
		//int sum=MySolution.solution(1000000);
		//int sum=Solution3Math.solution(1000000);
		System.out.println(sum);
		long end=System.currentTimeMillis();
		System.out.println(end-start+" ms");
	}
}
