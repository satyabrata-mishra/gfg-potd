package cp;
import java.util.*;
public class Longest_Sub_Array_with_Sum_K 
{
	public static int lenOfLongSubarr (int A[], int N, int K) 
    {
		int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        map.put(0, -1);
        for(int i=0; i<N; i++)
        {
            sum += A[i];
            if(map.containsKey(sum-K))
                ans = Math.max(ans, i-map.get(sum-K));
            if(map.containsKey(sum)==false) 
            	map.put(sum, i);
        }
        return ans;
    }
	public static void main(String[] args) 
	{
		int A[] = {10, 5, 2, 7, 1, 9};
		int K = 15;
		System.out.println(lenOfLongSubarr(A,A.length,K));
	}

}
