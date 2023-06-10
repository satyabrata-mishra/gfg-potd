package cp;
import java.util.*;
public class Frequency_Game 
{
	public static int LargButMinFreq(int arr[], int n) 
	{
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<n;i++)
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		int num = Integer.MIN_VALUE,freq=Integer.MAX_VALUE;
		for(int i:map.keySet())
		{
			if(map.get(i)<=freq && i>num)
			{
                num=i;
	            freq=map.get(i);
			}
		}
		return num;
	}
	public static void main(String[] args) 
	{
		int arr[]= {2, 2, 5, 50, 1};
		System.out.println(LargButMinFreq(arr,arr.length));
	}
}