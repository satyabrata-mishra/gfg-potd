package cp;
public class Rotate_An_Array 
{
	public static void rotate(int a[],int n)
	{
		int temp=a[n-1];
		for(int i=n-1;i>=1;i--)
			a[i]=a[i-1];
		a[0]=temp;
	}
	public static int maxSum(int[] arr, int n) 
    {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			int sum=0;
			for(int j=0;j<arr.length;j++)
				sum+=j*arr[j];
			if(sum>max)
				max=sum;
			rotate(arr,arr.length);
		}
		return max;
	}
	public static void main(String[] args) 
	{
		int arr[]= {1,3,10,-2,0};
		System.out.println(maxSum(arr,arr.length));
	}

}
