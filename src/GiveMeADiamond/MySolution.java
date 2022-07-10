package GiveMeADiamond;

//time complexity:18 ms for number=101

class MySolution 
{
	public static String Diamond(int n) 
	{
		int t = n/2;
    	String star="*";
    	String space=" ";
    	StringBuffer str = new StringBuffer();

	    if(n%2==0||n<0)
	    	return null;
	    else
	    {
	    	for(int i=0;i<t+1;i++)
	    	{
	    		String repeated = new String(new char[t-i]).replace("\0", space)+new String(new char[1+2*i]).replace("\0", star)+"\n";
	    		str.append(repeated);
	    	}
	    	for(int j=n;j>t+1;j--)
    		{
	    		String repeated = new String(new char[n-j+1]).replace("\0", space)+new String(new char[2*j-n-2]).replace("\0", star)+"\n";
	    		str.append(repeated);
    		}
	    	String fin=str.toString();
	    	return fin;
	    }
	}
}
