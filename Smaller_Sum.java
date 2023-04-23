package cp;
import java.util.*;
public class Smaller_Sum 
{
	public static int binarySearch(int key,int arr[],int n)
	{
		int low=0,high=n-1,index=0;
		while(low<=high)
		{
			int mid=low+(high-low)/2;
			if(arr[mid]==key)
			{
				index=mid;
				high=mid -1;
			}
			else if(arr[mid]<key)
    			low=mid+1;
    		else
    			high=mid-1;
		}
		return index;
	}
	public static long[] smallerSum(int n,int arr[])
    {
		int temp[] = new int[n];
		temp = Arrays.copyOf(arr,n);
		Arrays.sort(temp);
		long sum[]=new long[n];
		sum[0]=0;
		sum[1]=temp[0];
		for(int i=2;i<n;i++)
			sum[i]=sum[i-1]+temp[i-1];
        long ans[] = new long[n];
        for(int i=0;i<n;i++)
			ans[i]=sum[binarySearch(arr[i], temp, n)];
        return ans;
    }
	public static void main(String[] args) 
	{
		int arr[] = {3, 5, 1, 8, 9};
		long a[]=smallerSum(arr.length,arr);
		for (long i:a)
			System.out.print(i+" ");
	}
}
