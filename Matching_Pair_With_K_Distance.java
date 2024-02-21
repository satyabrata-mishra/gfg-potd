package cp;
import java.util.*;
public class Matching_Pair_With_K_Distance 
{
	public static long findGoodPairs(int a[], int n, int k)
    {
		long ans=0;
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=k;i<n;i++)
		{
			map.put(a[i-k],map.getOrDefault(a[i-k],0)+1);
			ans+=map.getOrDefault(a[i],0);
		}
		return ans;
    }
	public static void main(String[] args) 
	{
		int a[]={1,2,2,1,2};
		int k=2;
		System.out.println(findGoodPairs(a,a.length,k));
		int b[]= {1,1,1,1};
		k=1;
		System.out.println(findGoodPairs(b,b.length,k));
	}

}
