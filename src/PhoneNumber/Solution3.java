package PhoneNumber;

class Solution3 
{
	public static String createPhoneNumber(int[] numbers) 
	{
	    String phoneNumber = new String("(xxx) xxx-xxxx");
	    
	    for (int i : numbers) 
	    {
	      phoneNumber = phoneNumber.replaceFirst("x", Integer.toString(i));
	    }
	    
	    return phoneNumber;
	  }
}
