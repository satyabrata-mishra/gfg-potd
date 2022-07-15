package cp;
import java.util.*;
public class Smalest_Absolute_Differrence
{
	public static long kthDiff(int arr[], int n, int k)
    {
		ArrayList<Long> absdiff=new ArrayList<Long>();
        for (int i=0;i<arr.length-1;i++)
        {
        	for (int j=i+1;j<arr.length;j++)
        	{
        		absdiff.add((long)Math.abs(arr[i]-arr[j]));
        	}
        }
        Collections.sort(absdiff);
        return absdiff.get(k-1);
    }
	public static void main(String[] args)
	{
		int arr[]= {1, 2, 3, 4};
		System.out.print(kthDiff(arr, arr.length,1));
//		Input : 
//			N = 4
//			A[] = {1, 2, 3, 4}
//			k = 3
//		Output : 
//			1 
//		Explanation :
//			The possible absolute differences are :
//			{1, 2, 3, 1, 2, 1}.
//			The 3rd smallest value among these is 1.
	}

}
