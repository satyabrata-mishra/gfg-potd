package cp;
import java.util.*;
public class Array_Pair_Sum_Divisibility_Problem 
{
	public static boolean canPair(int[] nums, int k) 
    {
		int n = nums.length,count=0;
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i:nums)
			if(i%k==0)
				++count;
			else
				al.add(i%k);
		if(count%2!=0)
			return false;
		Collections.sort(al);
		System.out.println(al);
		int start=0,end=al.size()-1;
		while(start<=end)
		{
			if(al.get(start)+al.get(end)==k)
			{
				start++;
				end--;
			}
			else
				return false;
		}
		return true;
    }
	public static void main(String[] args) 
	{
		int arr[] = {9, 5, 7, 3};
		int k = 6;
		System.out.println(canPair(arr,k));
	}

}
