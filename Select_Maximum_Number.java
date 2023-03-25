package cp;

public class Select_Maximum_Number
{
	public static int[] maximumDifference(int arr[],int n)
	{
		int minLeft[]=new int[n];
		int minRight[]=new int[n];
		int min=arr[0];
		for(int i=1;i<n;i++)
		{
			minLeft[i]=min;
			min=Math.min(min, arr[i]);
		}
		min=arr[n-1];
		for(int i=n-2;i>=0;i--)
		{
			minRight[i]=min;
			min=Math.min(min, arr[i]);
		}
		for(int i=0;i<n;i++)
			arr[i]=minLeft[i]-minRight[i];
		return arr;
	}
	public static void main(String[] args) 
	{
		int arr[] = {8,4,2,6};
		arr=maximumDifference(arr,arr.length);
		for(int i:arr)
			System.out.print(i+" ");
	}

}
