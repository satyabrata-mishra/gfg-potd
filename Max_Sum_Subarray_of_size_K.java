package cp;
import java.util.*;
public class Max_Sum_Subarray_of_size_K 
{
	static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N)
    {
		long max=0,sum=0;
        for(int i=0;i<K;i++)
            sum+=Arr.get(i);
        max=Math.max(max,sum);
        for(int i=K;i<N;i++)
        {
            sum=sum-Arr.get(i-K);
            sum+=Arr.get(i);
            max=Math.max(max,sum);
        }
        return max;
    }
	public static void main(String[] args) 
	{
		ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(100, 200, 300, 400));
		int k=2;
		System.out.println(maximumSumSubarray(k, list,list.size()));
	}
}