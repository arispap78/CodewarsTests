package SmilingFaces;

import java.util.List;

/*
 * Given an array (arr) as an argument complete the function countSmileys that should return the total number of smiling faces.

Rules for a smiling face:

Each smiley face must contain a valid pair of eyes. Eyes can be marked as : or ;
A smiley face can have a nose but it does not have to. Valid characters for a nose are - or ~
Every smiling face must have a smiling mouth that should be marked with either ) or D
No additional characters are allowed except for those mentioned.

Valid smiley face examples: :) :D ;-D :~)
Invalid smiley faces: ;( :> :} :]

Example
countSmileys([':)', ';(', ';}', ':-D']);       // should return 2;
countSmileys([';D', ':-(', ':-)', ';~)']);     // should return 3;
countSmileys([';]', ':[', ';*', ':$', ';-D']); // should return 1;
Note
In case of an empty array return 0. You will not be tested with invalid input (input will always be an array). 
Order of the face (eyes, nose, mouth) elements will always be the same.
 */
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
