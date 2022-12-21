package cp;
import java.util.*;
public class Sieve_Of_Eratosthenes //All Prime Number In An Given Range
{
	public static ArrayList<Integer> allPrimeNumberInRange(int n)
	{
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int arr[]=new int[n+1];
		Arrays.fill(arr, 1);
		arr[0]=arr[1]=0;
		for(int i=2;i*i<=n;i++)
			if(arr[i]==1)
				for(int j=i*i;j<=n;j+=i)
					arr[j]=0;
		for(int i=0;i<=n;i++)
			if(arr[i]==1)
				ans.add(i);
		return ans;
	}
	public static void main(String[] args) 
	{
		System.out.println(allPrimeNumberInRange(100));
	}

}
