package cp;
import java.util.*;
public class Top_K_Frequent_Elements_in_Array 
{
	public static int[] topK(int[] nums, int k)
    {
		Map<Integer, Integer> map = new HashMap<>();
        int i;
        int n=nums.length;
        for (i=0;i<n;i++)
             map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        Queue<Integer> queue = new PriorityQueue<>((a,b)->(map.get(a) == map.get(b))?b-a : map.get(b)-map.get(a));
        for (int key: map.keySet())
             queue.add(key);
        nums = new int[k];
        for ( i = 0; i < k; i++) 
            nums[i] = queue.remove();
        return nums;
    }
	public static void main(String[] args) 
	{
		int nums[] = {1,1,2,2,3,3,3,4};
		int k=2;
		nums=topK(nums,k);
		for(int i:nums)
			System.out.print(i+" ");
	}
}