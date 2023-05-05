package cp;
import java.util.*;
public class Max_Coins 
{
	public static int maxCoins(int n,int ranges[][])
    {
		Arrays.sort(ranges , (a,b)->a[0]==b[0]?a[1]-b[1]:a[0]-b[0]);
        int temp[] = new int[n];
        temp[n-1]=ranges[n-1][2];
        for(int i=n-2;i>=0;i--)
        	temp[i]=Math.max(temp[i+1],ranges[i][2]);
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            int sum=ranges[i][2],low = i+1,high=n-1,t=0;
            while(low<=high)
            {
                int mid = low + (high-low)/2;
                if(ranges[mid][0]>=ranges[i][1])
                {
                    t=temp[mid];
                    high=mid-1;
                }
                else 
                	low=mid+1;
            }
            sum+=t;
            ans=Math.max(sum,ans);
        }
        return ans;
    }
	public static void main(String[] args) 
	{
		int ranges[][]={{1,3,4},{2,3,5},{3,4,2}};
		System.out.println(maxCoins(ranges.length,ranges));
	}
}