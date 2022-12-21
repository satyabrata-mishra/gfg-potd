package cp;
public class Rearrange_Array_Alternatively 
{
	public static void rearrange(long arr[], int n)
	{
		long ans[]=new long[n];
		int start=0,end=n-1;
		for(int i=0;i<n;i++)
			if(i%2==0)
				ans[i]=arr[end--];
			else
				ans[i]=arr[start++];
		for(int i=0;i<n;i++)
			arr[i]=ans[i];
    }
	public static void main(String[] args) 
	{
		long a[]= {1,2,3,4,5,6};
		rearrange(a,a.length);
		for (long i:a)
			System.out.print(i+" ");
	}
}
