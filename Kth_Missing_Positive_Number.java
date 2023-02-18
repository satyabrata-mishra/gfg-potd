package cp;
import java.util.*;
public class Kth_Missing_Positive_Number 
{
	public static int findKthPositive(int[] arr, int k) //O(n)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		int i=0,missing=0;
		while(list.size()!=k) 
		{
			++missing;
			if(i<arr.length && arr[i]==missing)
			{
				i++;
				continue;
			}
			list.add(missing);
		}
		return list.get(k-1);
	}
	public static int findKthPositive1(int[] arr, int k) //O(log n)
	{
		int beg = 0,end = arr.length;
		while (beg < end)
        {
        	int mid = beg+(end-beg) / 2;
        	if (arr[mid] - mid - 1 < k)
        		beg = mid + 1;
        	else
        		end = mid;		        	
        }
        return end + k;
	}
	public static void main(String[] args)
	{
		int arr[] = {1,2,3,4};
		System.out.println(findKthPositive1(arr,2));
	}
}
