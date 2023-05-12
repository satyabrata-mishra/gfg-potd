package cp;
public class Array_Operation 
{
	public static int arrayOperations(int n, int[] arr)
    {
		int ans=0,subarray=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]!=0)
				subarray++;
			else if(subarray!=0)
			{
				++ans;
				subarray=0;
			}
		}
		if(subarray!=0)
			ans++;
		return ans;
    }
	public static void main(String[] args) 
	{
		int arr[] = {5, 2, 6, 0, 0};
		System.out.println(arrayOperations(arr.length,arr));
	}
}