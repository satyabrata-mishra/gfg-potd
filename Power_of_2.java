package cp;
public class Power_of_2 
{
	public static boolean isPowerofTwo(long n)
    {
		if(n == 0) 
            return false;
        return (n & n-1) == 0 ? true : false;
    }
	public static void main(String[] args) 
	{
		System.out.println(isPowerofTwo(8)?"YES":"NO");
		System.out.println(isPowerofTwo(98)?"YES":"NO");
	}
}