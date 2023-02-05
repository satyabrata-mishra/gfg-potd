package cp;
import java.util.*;
public class Convert_an_array_to_reduced_form 
{
	public static void convert(int[] arr, int n) 
    {
		int[] temp = arr.clone();
		Arrays.sort(temp);
	    HashMap<Integer,Integer> hm = new HashMap<>();
	    int val=0;
	    for(int num : temp) 
	    	hm.put(num , val++);
	    for(int i=0;i<n;i++)    
	    	arr[i] = hm.get(arr[i]);
    }
	public static void main(String[] args) 
	{
		int arr[] = {5, 10, 40, 30, 20};
		convert(arr,arr.length);
		for(int i:arr)
			System.out.print(i+" ");
	}

}
