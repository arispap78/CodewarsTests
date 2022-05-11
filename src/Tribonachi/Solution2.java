package Tribonachi;

class Solution2 
{
	public static double[] tribonacci(double[] s, int n) 
	{
	      double[] r = new double[n];
	      for(int i = 0; i < n; i++)
	      {
	    	/*
	    	 * Many people thought it's clever, but maybe it's not that much.
	    	  In the cycle, these is an if checking, for every i, if i<3.
	    	  This will happen only 3 times. If you have n = 1000, you do this comparison 99% of times for no reason.
	    	  Short code, but worth it?
	    	  */
	        r[i] = (i<3)?s[i]:r[i-3]+r[i-2]+r[i-1];
	      }
	      return r;
	}
}
