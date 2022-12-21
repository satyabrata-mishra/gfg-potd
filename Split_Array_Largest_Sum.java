package cp;
public class Split_Array_Largest_Sum 
{	
	private static boolean isValid(int[] arr, int requiredSum, int k) 
	{
        int sum = 0;
        int count = 1;
        for(int num : arr) 
        {
            sum += num;
            if(sum > requiredSum)
            {
                count++;
                sum = num;
            } 
        }
        return count <= k;
    }
	static int splitArray(int[] arr , int N, int K) 
    {
		int totalSum =0;
        int max = Integer.MIN_VALUE;
        for(int num : arr) 
        {
            totalSum += num;
            max = Math.max(max, num);
        }
        int low = max;
        int high = totalSum;
        int ans = Integer.MAX_VALUE;
        while(low <= high) 
        {
            int mid = low + (high - low)/2;
            if(isValid(arr, mid, K)) 
            {
                ans = Math.min(ans, mid);
                high = mid - 1;
            } 
            else 
            {
                low = mid + 1; 
            }
        }
        return ans;
    }
	public static void main(String[] args) 
	{
		int arr[] = {1,1,2};
		int K = 2;
		System.out.println(splitArray(arr,arr.length,K));
	}

}
