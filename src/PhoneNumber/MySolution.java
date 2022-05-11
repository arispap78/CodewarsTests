package PhoneNumber;

/*Description:
Write a function that accepts an array of 10 integers (between 0 and 9), that returns a string of those numbers in the form of a phone number.

Example
Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"
*/


class MySolution
{
	  public static String createPhoneNumber(int[] numbers) 
	  {
	    String array="(";
	    for(int i=0;i<3;i++)
	      array+=String.valueOf(numbers[i]);
	    array+=") ";
	    for(int i=3;i<6;i++)
	      array+=String.valueOf(numbers[i]);
	    array+="-";
	    for(int i=6;i<10;i++)
	      array+=String.valueOf(numbers[i]);
	    return array;
	  }
	}