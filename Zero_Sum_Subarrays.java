package cp;
import java.util.*;
public class Zero_Sum_Subarrays 
{
	public static long findSubarray(long[] arr ,int n) 
    {
		long ans=0,sum=0;
		HashMap<Long,Long> map = new HashMap<Long, Long>();
		for(long i:arr)
		{
			sum+=i;
			if(sum==0)
				++ans;
			if(map.containsKey(sum))
			{
				ans+=map.get(sum);
				map.put(sum, map.get(sum)+1);
			}
			else
				map.put(sum, 1l);
		}
		return ans;
    }
	public static void main(String[] args) 
	{
		long arr[] = {6,-1,-3,4,-2,2,4,6,-12,-7};
		System.out.println(findSubarray(arr,arr.length));
	}

}
