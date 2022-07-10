package EvenFibonachi;


class MySolution 
{
	public static int EvenFibonachiNumber(int a,int b,int s) 
	{
		int sum=s;
		int c=a+b;
		if(c<=4000000) 
		{
			if(c%2==0)
				sum+=c;
			return EvenFibonachiNumber(b,c,sum);
		}
			
		else
			return sum;
	}
}
