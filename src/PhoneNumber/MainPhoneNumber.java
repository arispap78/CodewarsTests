package PhoneNumber;

/*Description:
Write a function that accepts an array of 10 integers (between 0 and 9), that returns a string of those numbers in the form of a phone number.

Example
Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"
*/

public class MainPhoneNumber 
{
	public static void main(String [] args)
	{
		long start = System.currentTimeMillis();
		//String phoneNumber=Solution7.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0});
		String phoneNumber=MySolution.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0});
		System.out.println(phoneNumber);
		long end = System.currentTimeMillis();
	    System.out.println((end - start) + " ms");
	}

}
