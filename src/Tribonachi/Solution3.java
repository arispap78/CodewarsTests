package Tribonachi;

import java.util.stream.Stream;

//time complexity:102 ms for number=200

class Solution3
{
	public static double[] tribonacci(double[] s, int n) 
	{
	     return Stream.iterate(s, p -> new double[]{p[1], p[2], p[0] + p[1] + p[2]}).limit(n).mapToDouble(p -> p[0]).toArray();
	}
}
