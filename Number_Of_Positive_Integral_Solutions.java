// For positive integral solution (sum-1) C (var-1)
package cp;
public class Number_Of_Positive_Integral_Solutions 
{
	public static long ncr(long n,long r)
	{
		long up = 1;
        long down = 1;
        for(int i=1;i<=r;i++)
            up *= n--;
        for(int i=1;i<=r;i++)
            down *= i;
        return up / down;
	}
	public static long posIntSol(String s)
    {
		int ind=s.indexOf('=');
		long k=Long.parseLong(s.substring(ind+1));
		long n=1;
		for(int i=0;i<ind;i++)
			if(s.charAt(i)=='+')
				++n;
		return ncr(k-1,n-1);
    }
	public static void main(String[] args)
	{
		String str="a+b+c=25";
		System.out.println(posIntSol(str));
	}

}
