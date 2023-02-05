package cp;
public class Absolute_Difference_Divisible_By_K 
{
	public static long countPairs(int n, int[] arr, int k) 
	{
		long count=0;
		int a[]=new int[k];
		for(int i=0;i<n;i++)
		{
			arr[i]%=k;
			count+=a[arr[i]];
			a[arr[i]]++;
		}
		return count;
	}
	public static void main(String[] args) 
	{
		int arr[] = {3, 7, 11};
		System.out.println(countPairs(arr.length,arr,4));
	}
}