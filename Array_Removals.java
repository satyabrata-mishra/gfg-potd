package cp;
import java.util.*;
public class Array_Removals 
{
	public static int removals(int[] arr,int n,int k)
	{
		Arrays.sort(arr);
		int res=0;
		for(int i=0;i<n;i++)
			for(int j=i;j<n;j++)
				if(arr[j]-arr[i]<=k)
					res=Math.max(res, j-i+1);
		return n-res;
	}
	public static void main(String[] args) 
	{
		int arr[] = {1,3,4,9,10,11,12,17,20};
		System.out.println(removals(arr,arr.length,4));
	}

}
