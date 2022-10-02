package cp;
import java.util.*;
public class Minimum_Costs_Of_Rope
{
	static long minCost(long arr[], int n) 
    {
		long cost = 0;
		PriorityQueue<Long> p = new  PriorityQueue<Long>();
		for(long i:arr)
			p.add(i);
		while(p.size()>=2)
		{
			long a = p.remove();
			long b = p.remove();
			cost+=(a+b);
			p.add(a+b);
		}
		return cost;
    }
	public static void main(String[] args)
	{
		long arr[] = {4, 3, 2, 6};
		System.out.println(minCost(arr,arr.length));
	}

}
