package cp;
public class Sum_of_XOR_of_all_pairs 
{
	public static long sumXOR (int arr[], int n) 
    {
		long result = 0;
        for (int i = 0; i < 32; i++) 
        {
            int count0 = 0;
            int count1 = 0;
            int bit = 1 << i;
            for (int j = 0; j < n; j++) 
            {
                if ((arr[j] & bit) == 0)
                    count0++;
                else 
                    count1++;
            }
            result+=(long)count0*count1*(1 << i);
        }
        return result;
    }
	public static void main(String[] args) 
	{
		int arr[ ] = {5, 9, 7, 6};
		System.out.println(sumXOR(arr, arr.length));
	}
}