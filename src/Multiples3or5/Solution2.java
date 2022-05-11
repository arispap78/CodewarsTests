package Multiples3or5;

import java.util.stream.IntStream;

//time:94 ms for number=1000000
class Solution2 
{
	public static int solution(int number) 
	{
	    return IntStream.range(0, number)
	                    .filter(n -> (n % 3 == 0) || (n % 5 == 0))
	                    .sum();
	}

}
