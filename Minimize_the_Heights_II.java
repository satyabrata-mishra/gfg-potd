package cp;
import java.util.*;
public class Minimize_the_Heights_II 
{
	public static int getMinDiff(int[] arr, int n, int k) 
    {
		Arrays.sort(arr);
        int ans=arr[n-1]-arr[0],min=0,max=0;
        for(int i=1;i<n;i++)
        {
            if(arr[i]-k<0) 
                continue;
        	max=Math.max(arr[i-1]+k, arr[n-1]-k);
        	min=Math.min(arr[0]+k, arr[i]-k);
        	ans=Math.min(ans,max-min);
        }
        return ans;
    }
	public static void main(String[] args)
	{
		int k = 3;
		int arr[] = {3, 9, 12, 16, 20};
		System.out.println(getMinDiff(arr,arr.length,k));
	}
}