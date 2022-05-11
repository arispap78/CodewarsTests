package VowelCount;

/*
 * Return the number (count) of vowels in the given string.
We will consider a, e, i, o, u as vowels for this Kata (but not y).
The input string will only consist of lower case letters and/or spaces.
 */
class MySolution 
{
	public static int getCount(String str) {
	    int vowelsCount = 0;
	    char[] vowel=str.toCharArray();
	    for(char v:vowel)
	    {
	    	if(v=='a'||v=='e'||v=='i'||v=='o'||v=='u')
	    		vowelsCount+=1;
	    }
	    return vowelsCount;
	  }


}
