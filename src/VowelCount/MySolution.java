package VowelCount;

//time complexity:1 ms

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
