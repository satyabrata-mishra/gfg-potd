//A subsequence of array is called Bitonic if it is 
//first strictly increasing, then strictly decreasing.
package cp;
import java.util.*;
public class Longest_Bitonic_Subsequence 
{
	public static int LongestBitonicSequence(int[] nums)
    {
        int N = nums.length;
        int [] LIS = new int[N];
        int [] LDS = new int[N];
        Arrays.fill(LIS,1);
        Arrays.fill(LDS,1);
        for(int i=1; i< N; i++)
            for(int j=0; j< i; j++)
                if(nums[i] > nums[j] )
                	LIS[i]=Math.max(LIS[i], LIS[j]+1);
        for(int i= N-1; i>=0; i--)
            for(int j= N-1; j> i; j--)
                if(nums[i] > nums[j])
                    LDS[i]=Math.max(LDS[i], LDS[j]+1);
        int max = 0;
        for(int i=0; i< N; i++)
        	max = Math.max(max, LIS[i]+ LDS[i] -1);
        return max;
    }
	public static void main(String[] args) 
	{
		int nums[] = {1, 2, 5, 3, 2};
		System.out.println(LongestBitonicSequence(nums));
	}
}
