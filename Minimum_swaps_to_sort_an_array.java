package cp;
import java.util.*;
public class Minimum_swaps_to_sort_an_array
{
	public static int minSwaps(int nums[])
    {
		int count=0;
		int temparr[]=nums.clone();
		Arrays.sort(temparr);
		for (int i=0;i<nums.length;i++)
		{
			if(nums[i]!=temparr[i])
			{
				++count;
				int j=0;
				for (j=0;j<nums.length;j++)
					if(nums[j]==temparr[i])
						break;
				int temp=nums[i];
				nums[i]=nums[j];
				nums[j]=temp;
			}
		}
//		for (int i=0;i<nums.length;i++)
//			System.out.print(nums[i]+" ");
		return count;
    }
	public static void main(String[] args)
	{
		int num[]= {10, 19, 6, 3, 5};
		System.out.println(minSwaps(num));
//		minSwaps(num);
	}

}
