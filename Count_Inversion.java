//For an array, inversion count indicates 
//how far (or close) the array is from 
//being sorted. If array is already sorted 
//then the inversion count is 0. If an array 
//is sorted in the reverse order then the 
//inversion count is the maximum. 

package cp;

import java.util.*;

public class Count_Inversion 
{
	 public static long mergeAndCount(long[] arr, int l, int m, int r)
	{
		 long[] left = Arrays.copyOfRange(arr, l, m + 1);
		 long[] right = Arrays.copyOfRange(arr, m + 1, r + 1);
		int i = 0, j = 0, k = l;
		long swaps = 0;
		while (i < left.length && j < right.length) 
		{
			if (left[i] <= right[j])
				arr[k++] = left[i++];
			else 
			{
				arr[k++] = right[j++];
				swaps += (m + 1) - (l + i);
			}
		}
		while (i < left.length)
			arr[k++] = left[i++];
		while (j < right.length)
			arr[k++] = right[j++];
		return swaps;
	}
	public static long mergeSortAndCount(long arr[],int l,int r)
	{
		long count = 0;  
        if (l < r) 
        {
            int m = (l + r) / 2;
            count += mergeSortAndCount(arr, l, m);
            count += mergeSortAndCount(arr, m + 1, r);
            count += mergeAndCount(arr, l, m, r);
        }
  
        return count;
	}
	public static long inversionCount(long arr[], long N)
    {
		return mergeSortAndCount(arr,0,arr.length-1);
    }
	public static void main(String[] args) 
	{
		long arr[] = {2, 4, 1, 3, 5};
		System.out.println(inversionCount(arr,arr.length));
	}

}
