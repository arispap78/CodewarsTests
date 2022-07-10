package MakeTheDeadfishSwim;

import java.util.ArrayList;

//time complexity:106 ms
class MySolution 
{
	public static int[] parse (String data) 
	{
		int res=0;
		char[]xar=data.toCharArray();
		//long times=data.chars().filter(ch->ch=='o').count();
        ArrayList<Integer>arr=new ArrayList<>();
        for(char v:xar) 
        {
        	if(v=='i')
        		res+=1;
        	else if(v=='d')
        		res-=1;
        	else if(v=='s')
        		res=res*res;
        	else if(v=='o')
        		arr.add(new Integer(res));
        }
        int[] sum = arr.stream().mapToInt(i -> i).toArray();
        return sum;
    }

}
