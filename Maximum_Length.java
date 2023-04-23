package cp;

public class Maximum_Length
{
	public static int solve(int a, int b, int c) 
    {
		if((a>(2*(b+c))+2) || (b>(2*(a+c))+2) || (c>(2*(a+b))+2))
			return -1;
		return a+b+c;
    }
	public static void main(String[] args) 
	{
		System.out.println(solve(3,3,3));
	}

}
