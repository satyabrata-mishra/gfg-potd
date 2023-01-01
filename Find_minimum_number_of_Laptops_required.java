package cp;
import java.util.*;
public class Find_minimum_number_of_Laptops_required 
{
	public static int minLaptops(int N, int[] start, int[] end) 
    {
		TreeMap<Integer,Integer> map = new TreeMap<Integer, Integer>();
		for(int i=0;i<N;i++)
		{
			if(map.containsKey(start[i]))
				map.put(start[i], map.get(start[i])+1);
			else
				map.put(start[i], 1);
			if(map.containsKey(end[i]))
				map.put(end[i], map.get(end[i])-1);
			else
				map.put(end[i], -1);
		}
		int ans=Integer.MIN_VALUE,sum=0;
		for(int i:map.keySet())
		{
			sum+=map.get(i);
			ans=Math.max(ans, sum);
		}
		return ans;
    }
	public static void main(String[] args) 
	{
		int start[] = {1, 5, 2};
		int end[] =   {2, 6, 3};
		System.out.println(minLaptops(start.length,start,end));
	}

}
