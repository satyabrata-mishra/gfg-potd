package cp;
import java.util.*;
public class Maximize_the_sum_of_selected_numbers_from_a_sorted_array_to_make_it_empty 
{
	public static int maximizeSum (int arr[], int n) 
    {
		HashMap<Integer,Integer> hs = new HashMap<Integer, Integer>();
		for(int i:arr)
			if(hs.containsKey(i))
				hs.put(i, hs.get(i)+1);
			else
				hs.put(i,1);
		int count = 0;
		for(int i=n-1;i>=0;i--)
			if(hs.get(arr[i])>0) 
			{
				count+=arr[i];
				hs.put(arr[i], hs.get(arr[i])-1);
				if(hs.containsKey(arr[i]-1))
					hs.put(arr[i]-1, hs.get(arr[i]-1)-1);
			}
		return count;
    }
	public static void main(String[] args) 
	{
		int arr[]= {1, 2, 2, 2, 3, 4};
		System.out.println(maximizeSum(arr,arr.length));
	}

}
