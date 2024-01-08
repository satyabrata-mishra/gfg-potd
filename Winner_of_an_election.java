package cp;
import java.util.*;
public class Winner_of_an_election 
{
	public static String[] winner(String arr[], int n)
    {
		HashMap<String,Integer> map=new HashMap<String, Integer>();
		for(String i:arr)
			map.put(i,map.getOrDefault(i,0)+1);
		String ans="";
		int temp=0;
		for(String i:map.keySet())
		{
			if(map.get(i)>temp)
			{
				ans=i;
				temp=map.get(i);
			}
			else if(map.get(i)==temp)
				ans=ans.compareTo(i)<0?ans:i;
		}
		return new String[]{ans,Integer.toString(temp)};
    }
	public static void main(String[] args) 
	{
		String arr[] = {"john","johnny","jackie","johnny","john","jackie","jamie",
				"jamie","john","johnny","jamie","johnny","john"};
		arr=winner(arr,arr.length);
		for(String i:arr)
			System.out.print(i+" ");
	}
}