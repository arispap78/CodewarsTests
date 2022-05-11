package Multiples3or5;

/*
The sum of multiples of 3 is 3 + 6 + 9 + ... = 3 (1+2+3+...)
The sum of mulitples of 5 is 5 + 10 + 15 + ... = 5 (1+2+3+...)
If we just sum these, we'll get double values when a number is divisble by both,
so we substract the sum of multiples of 15, which is obtained in a similar manner.
The upper bound cannot be floor function because the inputed number shouldn't count.
*/

//time:1 ms for numbers=1000000
import java.lang.Math;

//The sum 1 + 2 + 3 + ... + m has a closed form (meaning you can write a simple formula instead of looping through all numbers), 
//which is m * (m + 1) / 2
class Solution3Math 
{
	public static int solution(int n) 
	{
		int a = (int) Math.ceil(n/3d) - 1;//Try when it's a whole number. ceil(1) - 1 is not floor(1)
		int b = (int) Math.ceil(n/5d) - 1;
		int c = (int) Math.ceil(n/15d) - 1;
		return (3 * a * (a+1) + 5 * b * (b+1) - 15 * c * (c + 1)) / 2;
	}
}
