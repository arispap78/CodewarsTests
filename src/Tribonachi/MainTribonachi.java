package Tribonachi;

public class MainTribonachi 
{
	public static void main(String[] args) 
	{
		long start=System.currentTimeMillis();
		//double [] tribo=MySolution.tribonacci(new double[] {1.0,1.0,1.0},200);
		double [] tribo=Solution2.tribonacci(new double[] {1.0,1.0,1.0},2);
		for(double a:tribo)
			System.out.println(String.valueOf(a));
		long end=System.currentTimeMillis();
		System.out.println(end-start+" ms");
	}

}
