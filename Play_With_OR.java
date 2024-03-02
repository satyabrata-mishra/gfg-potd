package cp;
public class Play_With_OR
{
	public static int[] game_with_number (int arr[], int n) 
	{
		for(int i=0;i<n-1;i++)
			arr[i]=arr[i]|arr[i+1];
		return arr;
    }
	public static void main(String[] args) 
	{
		int arr[] = {5, 9, 2, 6};
		arr=game_with_number(arr,arr.length);
		for(int i:arr)
			System.out.print(i+" ");
	}
}