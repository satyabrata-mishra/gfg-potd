package cp;
import java.util.*;
//HashSet.contains() method TC is O(1) while ArrayList.contains() method TC is O(n)
public class Pythagorean_Triplet 
{
	public static boolean checkTriplet(int[] arr, int n)
    {
		HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i<n ; i++)
        {
            arr[i] = arr[i] * arr[i];
            set.add(arr[i]);
        }
        for(int i = 0 ; i<n-1 ; i++)
            for(int j = 0 ; j<n ; j++)
            	if(set.contains(arr[i] + arr[j]))
            		return true;
        return false;	
    }
	public static void main(String[] args) 
	{
		int arr[] = {3, 8, 5};
		System.out.println(checkTriplet(arr,arr.length)?"Yes":"No");
	}
}