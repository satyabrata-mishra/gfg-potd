package cp;
public class Optimal_Array 
{
	public static long[] optimalArray(int n,int a[])
    {
        long ans[] = new long[n];
        ans[0]=0;
        for(int i=1;i<n;i++)
        {
        	 int index = i/2;
        	 ans[i] = a[i]-a[index] + ans[i-1];
        }
        return ans;
    }
	public static void main(String[] args) 
	{
		int A[] = {1,6,9,12};
		long ans[] = optimalArray(A.length,A);
		for(long i:ans)
			System.out.print(i+" ");
	}
}
