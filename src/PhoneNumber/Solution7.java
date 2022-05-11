package PhoneNumber;

import java.util.Arrays;

class Solution7 
{
	private static String array2str(int[] arr, Integer start, Integer end) 
	{
        int[] part = Arrays.copyOfRange(arr, start, end);
        StringBuilder s = new StringBuilder();
        for (int i : part) {
            s.append(i);
        }
        return s.toString();
    }
    public static String createPhoneNumber(int[] numbers)
    {
        // Your code here!
        return String.format("(%s) %s-%s",
                array2str(numbers, 0, 3),
                array2str(numbers, 3, 6),
                array2str(numbers, 6, numbers.length));
    }

}
