package cp;
public class Next_Happy_Number 
{
	public static int sum_of_square_of_digits(int n)
	{
		int ans=0;
		while(n!=0)
		{
			ans+=(n%10)*(n%10);
			n/=10;
		}
		return ans;
	}
	public static boolean helper(int n)
	{
		int a=sum_of_square_of_digits(n);
		if(a==1 || a==7)
			return true;
		if(a<=9)
			return false;
		return helper(a);
	}
	public static int nextHappy(int N)
    {
		while(!helper(++N));
		return N;
    }
	public static void main(String[] args) 
	{
		System.out.println(nextHappy(8));
		System.out.println(nextHappy(13));
	}
}