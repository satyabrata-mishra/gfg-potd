package cp;
import java.util.*;
public class Three_Divisors 
{
	public static ArrayList<Integer> allPrimeInRange(int n)
	{
		ArrayList<Integer> ans = new ArrayList<Integer>();
		boolean prime[]=new boolean[n+1];
		Arrays.fill(prime, true);
		prime[0]=prime[1]=false;
		for(int i=2;i<=Math.sqrt(n);i++)
			if(prime[i]==true)
				for(int j=i+i;j<=n;j+=i)
					prime[j]=false;
		for(int i=0;i<n+1;i++)
			if(prime[i]==true)
				ans.add(i);
		return ans;
	}
	public static ArrayList<Integer> threeDivisors(ArrayList<Long> query, int q)
    {
		ArrayList<Integer> prime = allPrimeInRange(1000000);
		ArrayList<Integer> ans = new ArrayList<Integer>();
		for(long i:query)
		{
			int count=0;
			for(int j=2;j<=Math.sqrt(i);j++)
				if(prime.contains(j))
					++count;
			ans.add(count);
		}
		return ans;
    }
	public static void main(String[] args) 
	{
		ArrayList<Long> query = new ArrayList<Long>();
		query.add(6L);
		query.add(10L);
		System.out.println(threeDivisors(query,query.size()));
	}

}
