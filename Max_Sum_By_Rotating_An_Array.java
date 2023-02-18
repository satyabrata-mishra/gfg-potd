package cp;
public class Max_Sum_By_Rotating_An_Array 
{
	public static int max_sum(int arr[], int n)
    {
		int total_sum=0;
		for(int i:arr)
			total_sum+=i;	
		int first_config=0;
		for(int i=0;i<n;i++)
			first_config+=i*arr[i];
		int ans=first_config;
		System.out.println(first_config);
		for(int i=1;i<n;i++)
		{
			int current_config=first_config-(total_sum-arr[i-1])+arr[i-1]*(n-1);
			first_config=current_config;
			System.out.println(first_config);
			ans=Math.max(ans,first_config);
		}
		return ans;
    }
	public static void main(String[] args) 
	{
		int A[] = {8,3,1,2};
		System.out.println("Maximum sum after rotating the array is "+max_sum(A,A.length));
	}

}
