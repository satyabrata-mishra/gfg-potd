package cp;
import java.util.*;
public class Subesets_Sum
{
	public static void find_subset(int[] nums, int i, ArrayList < Integer > curr, ArrayList < ArrayList < Integer >> ans) 
	{
	    if (i == nums.length) 
	    {
	      ans.add(new ArrayList<Integer>(curr));
	      return;
	    }
	    curr.add(nums[i]);
	    find_subset(nums, i + 1, curr, ans);
	    curr.remove(curr.size() - 1);
	    find_subset(nums, i + 1, curr, ans);
	}
	public static ArrayList < ArrayList < Integer >> subsets(int[] nums) 
	{
		ArrayList < Integer > curr = new ArrayList < Integer > ();
		ArrayList < ArrayList < Integer >> ans = new ArrayList <ArrayList<Integer>> ();
		find_subset(nums, 0, curr, ans);
		return ans;
	}
	public static void main(String[] args) 
	{
		int arr[] = {1,2,3,4};
		ArrayList < ArrayList < Integer >> list = subsets(arr);
		System.out.println("All Possible Subsets Are:");
		list.sort((set1, set2) -> 
		{
            int i1 = 0, i2 = 0;
            int size1 = set1.size(), size2 = set2.size();
            if (set1.equals(set2))
                return 0;
            while (true) 
            {
                if (i1 >= size1) 
                    return -1;
                else if (i2 >= size2) 
                    return 1;
                else if (!Objects.equals(set1.get(i1), set2.get(i2))) 
                    return set1.get(i1) - set2.get(i2);
                i1++;
                i2++;
            }
        });
		System.out.println(list);
		int sum=4;
		System.out.println("All Possible Subsets With Total Sum Of " + sum + " is:" );
		for(int i=0;i<list.size();i++)
		{
			int tempsum=0;
			ArrayList<Integer> temp =list.get(i);
			for(int j:temp)
				tempsum+=j;
			if(tempsum==sum)
				System.out.print(temp+" ");
		}
	}
}
