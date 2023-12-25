package cp;
//Given a length n, count the number of strings of length n
//that can be made using a, b and c with atmost one b and two c allowed.
public class Strings_Count 
{
	public static long countStr(long n)
	{
	    return 1+(n*2)+(n*((n*n)-1)/2);
	}
	public static void main(String[] args)
	{
		System.out.println(countStr(1));
		System.out.println(countStr(3));
	}
}