package PhoneNumber;

//time complexity:2 ms

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