package Multiples3or5;

//time:8 ms for number=1000000
class Solution1 
{
	public static int solution(int number) {
	    int sum=0;
	    
	    for (int i=0; i < number; i++)
	    {
	      if (i%3==0 || i%5==0){sum+=i;}
	    }
	    return sum;
	  	}
}
