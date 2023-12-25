package cp;
public class Max_Sum_without_Adjacent 
{
	public static int findMaxSum(int arr[], int n) 
    {
		if(n==1)
			return 1;
		int value1=arr[0],value2=Math.max(arr[0],arr[1]),max_val=Math.max(arr[0],arr[1]);
		for(int i=2;i<n;i++)
		{
			max_val=Math.max(value1+arr[i],value2);
			value1=value2;
			value2=max_val;
		}
		return max_val;
    }
	public static void main(String[] args) 
	{
		int arr[] = {5, 5, 10, 100, 10, 5};
		System.out.println(findMaxSum(arr,arr.length));
	}
}