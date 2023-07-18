package cp;
import java.util.*;
public class Unique_Number_of_Occurrences 
{
	public static boolean isFrequencyUnique(int n, int[] arr)
    {
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i:arr)
			map.put(i, map.getOrDefault(i, 0)+1);
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i:map.keySet())
		{
			if(list.contains(map.get(i)))
				return false;
			else
				list.add(map.get(i));
		}
		return true;
    }
	public static void main(String[] args) 
	{
		int arr1[] = {1, 1, 2, 5, 5};
		System.out.println(isFrequencyUnique(arr1.length,arr1));
		int arr2[] = {2, 2, 5, 10, 1, 2, 10, 5, 10, 2};	
		System.out.println(isFrequencyUnique(arr2.length,arr2));
	}

}
