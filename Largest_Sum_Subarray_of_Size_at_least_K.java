package cp;
public class Largest_Sum_Subarray_of_Size_at_least_K 
{
	public static long maxSumWithK(long a[], long n, long k)
    {
		long prefixSum[]=new long[(int)n];
        prefixSum[0] = a[0];
        for (int i = 1; i < n; ++i) 
            prefixSum[i] = prefixSum[i-1]+a[i];
        long maxSum = prefixSum[(int)k-1],minPrefixSum=0;
        for (int i = (int)k; i < n; ++i) 
        {
            minPrefixSum = Math.min(minPrefixSum, prefixSum[i - (int)k]);
            maxSum = Math.max(maxSum, prefixSum[i] - minPrefixSum);
        }
        return maxSum;
    }
	public static void main(String[] args) 
	{
		long a[]={-4, -2, 1, -3};
		long k=2;
		System.out.println(maxSumWithK(a,a.length,k));
	}
}