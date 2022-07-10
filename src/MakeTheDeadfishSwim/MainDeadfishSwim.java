package MakeTheDeadfishSwim;

/*
 * Write a simple parser that will parse and run Deadfish.
Deadfish has 4 commands, each 1 character long:

i increments the value (initially 0)
d decrements the value
s squares the value
o outputs the value into the return array
Invalid characters should be ignored.
 */

public class MainDeadfishSwim
{
	public static void main(String[]args) 
	{
		long start=System.currentTimeMillis();
		//int[]result=MySolution.parse("iiisdosodddddiso");
		int[]result=Solution1.parse("iiisdosodddddiso");
		for(int a:result) 
		{
			System.out.println(a);
		}
		long end=System.currentTimeMillis();
		System.out.println(end-start+" ms");
	}
}

