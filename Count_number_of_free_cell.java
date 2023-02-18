package cp;
import java.util.*;
public class Count_number_of_free_cell 
{
	public static long[] countZero(int N, int K, int[][] arr)
    {
        long ans[]=new long[K];
        HashSet<Integer> xcor= new HashSet<Integer>();
        HashSet<Integer> ycor= new HashSet<Integer>();
        for(int i=0;i<K;i++)
        {
        	xcor.add(arr[i][0]);
        	ycor.add(arr[i][1]);
        	ans[i]=(N-xcor.size())*(N-ycor.size());
        }
        return ans;
    }
	public static void main(String[] args)
	{
		int arr[][]= {{2,2},{2,3},{3,2}};
		long a[]=countZero(3,3,arr);
		for(long i:a)
			System.out.print(i+" ");
	}

}
