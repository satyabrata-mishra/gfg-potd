package cp;
public class Smallest_Sum_Contigous_Subarray 
{
	static int smallestSumSubarray(int a[], int size)
    {
		int sum=a[0];
		int res=a[0];
		for(int i=1;i<size;i++)
		{
			sum=Math.min((sum+a[i]),a[i]);
			res=Math.min(res,sum);
		}
		return res;
    }
	public static void main(String[] args) 
	{
		int arr[] = {3,-4, 2,-3,-1, 7,-5};
		System.out.println(smallestSumSubarray(arr,arr.length));
	}

}
