package cp;
import java.util.*;
public class Nine_Divisors 
{
	public static boolean isprime(long n)
	{
		if(n<2)
			return true;
		for(long i=2;i<=Math.sqrt(n);i++)
			if(n%i==0)
				return false;
		return true;
	}
	public static long nineDivisors(long N)
    {
		if(N<36)
            return 0;
        ArrayList<Long> prime =new ArrayList<>();
        for(long i=2;i<=Math.sqrt(N);i++)
            if(isprime(i))
                prime.add(i);
        int n=prime.size(), count=0;
        for(int i=0 ;i<n;i++)
        {
            long x=prime.get(i);
            if((Math.pow(x,8)<=N))
                count++;
            else
                break;
        }
        for(int i=0 ;i<n;i++)
        {
            long x=prime.get(i);
            boolean flag=true;
            for(int j=i+1;j<n;j++)
            {
                long y=prime.get(j);
                if((x*x*y*y)<=N)
                {
                    flag=false;
                    count++;
                }
                else
                    break;
            }
            if(flag==true)
                break;
        }
        return count;
    }
	public static void main(String[] args) 
	{
		System.out.println(nineDivisors(100));
	}

}
