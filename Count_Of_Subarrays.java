package cp;
public class Count_Of_Subarrays 
{
	public static long countSubarray(int arr[], int n, int k) 
    {
		long ans=0;
		int p=-1;
		for(int i=0;i<n;i++)
		{
			if(arr[i]>k)
				p=i;
			ans+=(p+1);
		}
		return ans;
    }
	public static void main(String[] args) 
	{
		int a[] = {3, 2, 1};
		System.out.println(countSubarray(a,a.length,2));
	}

}
