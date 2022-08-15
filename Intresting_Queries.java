package cp;
import java.util.*;
public class Intresting_Queries
{
	public static int[] solveQueries(int[] nums, int[][] Queries, int k)
    {
		int ans[]=new int[Queries.length];
		for(int i=0;i<Queries.length;i++)
		{
			int l=Queries[i][0];
			int r=Queries[i][1];
			HashMap<Integer,Integer> hs = new HashMap<Integer, Integer>();
			for(int j=l-1;j<r;j++)
			{
				if(hs.containsKey(nums[j]))
					hs.put(nums[j], hs.get(nums[j])+1);
				else
					hs.put(nums[j], 1);
			}
			int count=0;
			for(int j:hs.keySet())
				if(hs.get(j)>=k)
					count++;
			ans[i]=count;
		}
		return ans;
    }
	public static void main(String[] args) 
	{
		int nums[] = {1,1,2,1,3};
		int Queries [][]= {{1,5},{2,4}};
		int k = 1;
		nums = solveQueries(nums,Queries,k);
		for(int i:nums)
			System.out.print(i+" ");
	}

}
