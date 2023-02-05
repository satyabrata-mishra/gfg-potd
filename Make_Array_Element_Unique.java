package cp;
import java.util.*;
public class Make_Array_Element_Unique 
{
	public static long minIncrements(int[] arr, int N) 
    {
		Arrays.sort(arr);
		long count=0;
		for(int i=1;i<N;i++)
			if(arr[i-1]>=arr[i])
			{
				int val = arr[i-1]-arr[i]+1;
				count+=val;
				arr[i]+=val;
			}
		System.out.println();
		return count;
    }
	public static void main(String args[])
	{
		int arr[] = {1, 1, 1, 1};
		System.out.println(minIncrements(arr,arr.length));
	}
}
