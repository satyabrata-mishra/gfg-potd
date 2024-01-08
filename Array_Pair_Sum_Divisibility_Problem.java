package cp;
import java.util.*;
public class Array_Pair_Sum_Divisibility_Problem 
{
	public static boolean canPair(int[] nums, int k) 
    {
		if(nums.length%2==1) 
			return false;
        HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++)
        	map.put(nums[i]%k,map.getOrDefault(nums[i]%k,0)+1);
        boolean ans=true;
        for(int i=1; i<k; i++)
        	if(map.get(i)!=map.get(k-i))
        		return false;
        return ans;
    }
	public static void main(String[] args)
	{
		int nums[] = {6, 14, 12, 14};
		int k=2;
		System.out.println(canPair(nums,k));
	}
}