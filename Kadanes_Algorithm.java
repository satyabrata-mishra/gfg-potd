package cp;

public class Kadanes_Algorithm 
{
	public static int maxSubarraySum(int a[], int n)
	{
		int max_so_far = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < n; i++)
        {
            count = count + a[i];
            if (max_so_far < count)
                max_so_far = count;
            if (count < 0)
                count = 0;
        }
        return max_so_far;
	}
	public static void main(String[] args) 
	{
		int arr[] = {1,2,3,-2,5};
		System.out.println(maxSubarraySum(arr,arr.length));
	}

}
