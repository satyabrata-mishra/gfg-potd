//Suppose there are 3 continuous 0's so no of sub array is 6 (n*(n+1))/2
package cp;

public class Number_Of_Sub_Arrays_With_0 
{
	public static long no_of_subarrays(int N, int [] arr)
	{
		long count = 0,zeros = 0;
	    for (int i = 0; i < N; i++) 
	    {
	        if (arr[i] == 0) 
	            zeros++;  
	        else 
	        {
	            count += (zeros * (zeros + 1)) / 2; 
	            zeros = 0; 
	        }
	    }
	    count += (zeros * (zeros + 1)) / 2; 
	    return count; 
	}
	public static void main(String[] args) 
	{
		int arr[] = {0, 0, 0};
		System.out.println(no_of_subarrays(arr.length,arr));
	}

}
