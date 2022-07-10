package GiveMeADiamond;

//time complexity:51 ms for number=101
class Solution3 
{
	public static String Diamond(int n) 
	{
        if (n < 0 || n % 2 == 0) 
        	return null;
        String shape = "";
        int midRow = n/2 + 1;
        for (int i = midRow; i <= n*2 - midRow; i++) 
        {
            for (int j = 1; j <= n - Math.abs(n - i); j++) 
            {
                if (j <= Math.abs(n - i))
                    shape += " ";
                else 
                    shape += "*";
            }
            shape += "\n";
        }
        return shape;
    }
}
