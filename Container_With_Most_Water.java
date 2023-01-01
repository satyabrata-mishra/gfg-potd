package cp;
public class Container_With_Most_Water 
{
	public static long maxArea(int A[], int len)
    {
		long ans = Integer.MIN_VALUE;
		int left = 0,right=len-1;
		while(left<=right)
		{
			long min = Math.min(A[right], A[left]);
			ans=Math.max(ans, min*(right-left));
			if(A[left]<A[right])
				++left;
			else
				--right;
		}
		return ans;
    }
	public static void main(String[] args) 
	{
		int a[] = {1,5,4,3};
		System.out.println(maxArea(a,a.length));
	}

}
