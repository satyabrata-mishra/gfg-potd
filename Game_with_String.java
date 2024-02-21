package cp;
import java.util.*;
public class Game_with_String 
{
	public static int minValue(String s, int k)
    {
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(char i:s.toCharArray())
			map.put(i,map.getOrDefault(i,0)+1);
		PriorityQueue<Integer> q=new PriorityQueue<Integer>(Collections.reverseOrder());
		for(char i:map.keySet())
			q.add(map.get(i));
		while(!q.isEmpty() && k--!=0)
		{
			int val=q.poll();
			--val;
			if(val!=0)
				q.add(val);
		}
		int ans=0;
		while(!q.isEmpty())
			ans+=Math.pow(q.poll(),2);
		return ans;
    }
	public static void main(String[] args) 
	{
		String s="abccc";
		int k=1;
		System.out.println(minValue(s,k));
	}
}