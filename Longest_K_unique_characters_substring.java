package cp;
import java.util.*;
public class Longest_K_unique_characters_substring 
{
	public static int longestkSubstr(String s, int k) 
    {
		int ans=-1,i=0,j=0,n=s.length();
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		for(;i<n;i++)
		{
			char ch1=s.charAt(i);
			map.put(ch1, map.getOrDefault(ch1,0)+1);
			for(;j<=i && map.size()>k;j++)
			{
				char ch2=s.charAt(j);
				map.put(ch2,map.get(ch2)-1);
				if(map.get(ch2)==0)
					map.remove(ch2);
			}
			if(map.size()==k)
				ans=Math.max(ans, i-j+1);
		}
		return ans;
    }
	public static void main(String[] args) 
	{
		System.out.println(longestkSubstr("aabacbebebe", 3));
		System.out.println(longestkSubstr("untxym", 4));
	}
}