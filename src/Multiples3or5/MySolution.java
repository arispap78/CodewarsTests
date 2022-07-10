package Multiples3or5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//time complexity:83 ms for number=1000000

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
