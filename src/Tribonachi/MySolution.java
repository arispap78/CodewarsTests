package Tribonachi;

//time complexity:13 ms for number=200

class MySolution 
{
	public static double[] tribonacci(double[] s, int n) 
	{
		double[]tribo=new double[n];
        if(n>3)
        {
          System.arraycopy(s, 0, tribo, 0, s.length);
          for(int i=3;i<n;i++)
            tribo[i]=tribo[i-1]+tribo[i-2]+tribo[i-3];
        }
        else
          System.arraycopy(s, 0, tribo, 0, n);
        return tribo;
	}
}
