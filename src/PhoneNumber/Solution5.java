package PhoneNumber;

//time complexity:1 ms

class Solution5
{
	public static String createPhoneNumber(int[] numbers) 
	{
	    // Your code here!
	    StringBuilder sb = new StringBuilder();
	    sb.append("(");
	    //int start = 0
	    for(int i = 0;i<3;i++){
	      sb.append(String.valueOf(numbers[i])); 
	    }
	    sb.append(") ");
	    for(int i = 3;i<6;i++){
	      sb.append(String.valueOf(numbers[i]));
	    }
	    sb.append("-");
	    for(int i= 6;i<10;i++){
	      sb.append(String.valueOf(numbers[i]));
	    }
	    return sb.toString();
	  }
}
