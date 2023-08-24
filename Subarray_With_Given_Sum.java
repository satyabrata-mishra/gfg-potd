package cp;
import java.util.*;
public class Subarray_With_Given_Sum 
{
	public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
		int j=0,sum=0;
		for(int i=0;i<n;i++)
		{
			sum+=arr[i];
			while(j<i && sum>s)
				sum-=arr[j++];
			if(sum==s)
				return new ArrayList<Integer>(Arrays.asList(j+1,i+1));
		}
		return new ArrayList<Integer>(Arrays.asList(-1));
    }
	public static void main(String[] args) 
	{
		int S=15;
		int A[] = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(subarraySum(A,A.length,S));
	}
}