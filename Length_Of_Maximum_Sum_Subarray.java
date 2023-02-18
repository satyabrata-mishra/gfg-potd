package cp;

public class Length_Of_Maximum_Sum_Subarray 
{
	public static int findMaxSum(int arr[],int n)
	{
		int count=0,max_so_far=Integer.MIN_VALUE,start=0,end=0,temp=0;
		for(int i=0;i<n;i++)
		{
			count+=arr[i];
			if(count>max_so_far)
			{
				max_so_far=count;
				start=temp;
				end=i;
			}
			if(count<0)
			{
				count=0;
				temp=i+1;
			}
		}
		return end-start+1;
	}
	public static void main(String[] args) 
	{
		int arr[] = {1,-2,-3,4,5};
		System.out.println(findMaxSum(arr,arr.length));
	}

}
