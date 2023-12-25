package cp;
public class Shuffle_integers 
{
	public static void shuffleArray(long arr[], int n)
    {
		for(int i=1,j=n/2;j<n-1&&i<n-1;j++,i=i+2)
		{
            long store = arr[i];
            arr[i] = arr[j];
            for(int k = j;k>i+1;k--)
                arr[k] = arr[k-1];
            arr[i+1] =store; 
        }
    }
	public static void main(String[] args) 
	{
		long arr[] = {1, 2, 3, 4, 5, 6}; //1 4 2 5 3 6
		shuffleArray(arr,arr.length);
		for(long i:arr)
			System.out.print(i+" ");
	}
}