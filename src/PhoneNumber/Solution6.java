package PhoneNumber;

import java.util.stream.IntStream;

//time complexity:106 ms

class Solution6 
{
	 public static String createPhoneNumber(int[] numbers) 
	 {
		  return String.format("(%d%d%d) %d%d%d-%d%d%d%d", IntStream.of(numbers).boxed().toArray());
	 }
}
