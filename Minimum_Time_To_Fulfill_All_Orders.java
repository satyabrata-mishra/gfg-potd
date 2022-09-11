package cp;

public class Minimum_Time_To_Fulfill_All_Orders 
{
	public static boolean canMake(int donuts,int time,int[] rank,int l)
	{
		int can=0;
		for(int i=0;i<l;i++)
		{
			int sum=0;
			for(int j=rank[i];sum+j<=time;j+=rank[i])
			{
				sum+=j;
				++can;
			}
		}
		return can>=donuts;
	}
	public static int findMinTime(int n, int l, int[] arr)
    {
		int low=0,high=Integer.MAX_VALUE;
		int ans = 0;
//		TC - O(nlogn)
		while(low<=high)
		{
			int mid = (low+high)/2;
			if(canMake(n,mid,arr,l))
			{
				ans = mid;
				high = mid-1;
			}
			else
				low  = mid+1;
		}
//		TC - O(n^2)
//		for(;low<high;low++)
//		{
//			if(canMake(n,low,arr,l))
//				return low;
//		}
		return ans;
    }
	public static void main(String[] args) 
	{
		int n = 8;
		int rank[] =  {1, 1, 1, 1, 1, 1, 1, 1};
		System.out.println(findMinTime(n,rank.length,rank));
	}

}
