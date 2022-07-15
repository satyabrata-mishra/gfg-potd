package cp;

public class Count_Pairs_In_Array_Divisible_By_K 
{
	public static long countKdivPairs1(int arr[], int n, int k)
    {
        //code here
		long r=0;
	    int[] c = new int[k];
	    for (int i=0; i<n; i++)
	    {
	        r += c[(k-arr[i]%k)%k];
	        c[arr[i]%k]++;
	    }
	    return r;
    }
	public static void main(String[] args)
	{
		int arr[]= {5, 9, 36, 74, 52, 31, 42};
		System.out.println(countKdivPairs1(arr,arr.length,3));
	}

}
