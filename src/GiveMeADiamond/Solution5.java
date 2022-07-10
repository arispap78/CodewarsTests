package GiveMeADiamond;

//time complexity:5 ms for number=101

class Solution5
{
	static String row(int n, int i) 
	{
        String s = "";
        for (int j = 0; j < (n - i) / 2; ++j) 
        {
            s += " ";
        }
        for (int j = 0; j < i; ++j) 
        {
            s += "*";
        }
        return s + "\n";
    }

    public static String Diamond(int n) 
    {
        if (n < 1 || n % 2 == 0) 
        {
            return null;
        }
        String s = row(n, n);
        for (int i = n - 2; i >= 1; i -= 2)
        {
            String r = row(n, i);
            s = r + s + r;
        }
        return s;
    }
}
