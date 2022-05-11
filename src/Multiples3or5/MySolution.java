package Multiples3or5;

/*
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.
Additionally, if the number is negative, return 0 (for languages that do have them).

Note: If the number is a multiple of both 3 and 5, only count it once.
 */
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//time complexity:93 ms for number=1000000
class MySolution
{
	  public static int solution(int number) 
	  {
		  Set<Integer>multiples=new HashSet();
		  int sum=0;
		  for(int i=3;i<number;i+=3)
			  multiples.add(i);
		  for(int j=5;j<number;j+=5)
			  multiples.add(j);
		  Iterator it=multiples.iterator();
		  while(it.hasNext())
			  sum+=(int)it.next();
		  //System.out.println(multiples);
		  return sum;    
	  }
}
