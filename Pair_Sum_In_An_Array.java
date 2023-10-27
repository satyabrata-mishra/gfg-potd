package cp;
import java.util.*;
public class Pair_Sum_In_An_Array 
{
	public static boolean hasArrayTwoCandidates(int arr[], int n, int x) 
    {
		Set<Integer>set=new HashSet<>();
		for(int i=0;i<n;i++)
		{
			int b=x-arr[i];
			if(set.contains(b))
				return true;
			else
        	  set.add(arr[i]);
		}
      return false;
    }
	public static void main(String[] args) 
	{
		int X = 10;
		int arr[] = {1, 2, 4, 3, 6};
		System.out.println(hasArrayTwoCandidates(arr,arr.length,X));
	}
}