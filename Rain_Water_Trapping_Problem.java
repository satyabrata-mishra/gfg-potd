package cp;
public class Rain_Water_Trapping_Problem 
{
	public static long trappingWater(int arr[], int n)
    { 
		long res = 0;
        int left[]=new int[n];
        int right[]=new int[n];
        // left boundary
        left[0] = arr[0];
        for(int i = 1; i<n; i++)
            left[i] = Math.max(left[i-1],arr[i]);
        // right boundary
        right[n-1] = arr[n-1];
        for(int i = n-2; i>= 0; i--)
            right[i] = Math.max(right[i+1],arr[i]);
        // Solution Loop
        for(int i = 1; i<n-1; i++)
        {
            int varVal = Math.min(left[i-1],right[i+1]);
            if( varVal > arr[i]) 
            	res += varVal-arr[i];
        }
        return res;
    }
	public static void main(String[] args) 
	{
		int arr[] = {3,0,0,2,0,4};
		System.out.println(trappingWater(arr,arr.length));
	}
}