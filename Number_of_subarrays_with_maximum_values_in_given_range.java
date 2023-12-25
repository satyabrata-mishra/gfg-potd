package cp;
public class Number_of_subarrays_with_maximum_values_in_given_range 
{
	static long countSubarrays(int a[], int n, int L, int R)  
    { 
		long ans=0;
		int left=0,windows=0;
		for(int right=0;right<n;right++)
		{
			if(a[right]>=L && a[right]<=R) 
				windows=right-left+1;
            else if(a[right]>R)
            {
                windows=0;
                left=right+1;
            }
            ans+=windows;
		}
		return ans;
    } 
	public static void main(String[] args)
	{
		int a[] = {2, 0, 11, 3, 0};
		int L=1,R=10;
		System.out.println(countSubarrays(a,a.length,L,R));
	}
}