package Multiples3or5;

//time:8 ms for numbers=1000000

class Solution4 
{
	public static int solution(int number) 
	{
	      int result = 0;
	      
	      for (int i = number - 1; i > 0; i--) 
	      {
	          if (i%5 == 0 || i%3 == 0)
	              result += i;
	      }
	      return result;
	 }

}
