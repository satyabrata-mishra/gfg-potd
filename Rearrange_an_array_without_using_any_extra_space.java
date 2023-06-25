package cp;
public class Rearrange_an_array_without_using_any_extra_space 
{
	public static void arrange(long arr[], int n)
    {
//		Using any extra space
//		long ans[]=new long[n];
//		for(int i=0;i<n;i++)
//			ans[i]=arr[(int)arr[i]];
//		for(int i=0;i<n;i++)
//			arr[i]=ans[i];
		
//		Without using any extra space
		for(int i=0;i<n;i++)
			arr[i]=(arr[(int)arr[i]]%n)*n+arr[i];
		for(int i=0;i<n;i++)
			arr[i]/=n;
    }
	public static void main(String[] args) 
	{
		long arr[] = {4,0,2,1,3};
		arrange(arr,arr.length);
		for(long i:arr)
			System.out.print(i+" ");
	}
}