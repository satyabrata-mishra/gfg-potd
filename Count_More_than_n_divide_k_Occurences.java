package cp;
import java.util.*;
public class Count_More_than_n_divide_k_Occurences 
{
	public static int countOccurence(int[] arr, int n, int k) 
    {
		HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
		for(int i:arr)
			map.put(i,map.getOrDefault(i,0)+1);
		int ans=0;
		for(int i:map.keySet())
			if(map.get(i)>n/k)
				++ans;
		return ans;
    }
	public static void main(String[] args) 
	{
		int arr[] = {3,1,2,2,1,2,3,3};
		int k=4;
		System.out.println(countOccurence(arr,arr.length,k));
	}

}
