package PhoneNumber;

//time complexity:111 ms

import java.util.Arrays;

class Solution2 
{
	public static String createPhoneNumber(int[] numbers) 
	{
	    return String.format("(%d%d%d) %d%d%d-%d%d%d%d", java.util.stream.IntStream.of(numbers).boxed().toArray());
	}

}
