package trial;
import java.util.*;
public class Kth_Smallest_Factor 
{
	public static void Kthsmallestfactor(int n,int k)
	{
		ArrayList<Integer> a=new ArrayList<Integer>();
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				a.add(i);
		}
		Collections.sort(a);
		int ans=-1;
		if (k-1<a.size())
			ans=a.get(k-1);
		else
			ans=-1;
			
		System.out.println(ans);
	}
	public static void main(String[] args) 
	{
		Kthsmallestfactor(1,1);
	}

}
