package cp;
public class Frequencies_of_Limited_Range_Array_Elements 
{
	public static void frequencyCount(int arr[], int N, int P)
    {
		P++;
	    for (int i = 0; i < N; i++) 
	    {
	        int index = (arr[i] % P) - 1;
	        if (index >= 0 && index < N) 
	        {
	            arr[index] += P;
	        }
	    }
	    for (int i = 0; i < N; i++) 
	        arr[i] = arr[i] / P;
    }
	public static void main(String[] args) 
	{
		int arr[] = {8,9};
		int P = 9;
		frequencyCount(arr, arr.length, P);
		for(int i:arr)
			System.out.print(i+" ");
	}
}