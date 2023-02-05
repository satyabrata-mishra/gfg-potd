package cp;
import java.util.*;
public class Minimize_The_Sum 
{
	public static long minimizeSum(int N, int arr[]) 
    {
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		for(int i:arr)
			q.add(i);
		long sum=0;
		while(q.size()!=1)
		{
			int t1=q.remove()+q.remove();
			sum+=(t1);
			q.add(t1);
		}
		return sum;
    }
	public static void main(String[] args) 
	{
		int arr[] = {1, 3, 7, 5, 6};
		System.out.println(minimizeSum(arr.length,arr));
	}

}
