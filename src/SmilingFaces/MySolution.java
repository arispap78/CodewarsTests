package SmilingFaces;

import java.util.List;


class MySolution 
{
	public static int countSmileys(List<String> arr) 
	{
	  int cnt=0;
      for(String smile:arr)
      {
    	  if(smile.length()==0)
    		  return 0;
    	  else if((smile.startsWith(":")||smile.startsWith(";"))&&(smile.endsWith(")")||smile.endsWith("D")))
    	  {
    		  if(smile.length()==3)
    		  {
    			  if(smile.contains("-")||(smile.contains("~")))
    	        		cnt+=1;
    		  }
    		  else if(smile.length()<3)
          		cnt+=1;
    	  }
    	  
      }
      return cnt;
	}
}
