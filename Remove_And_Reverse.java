package cp;
import java.util.*;
public class Remove_And_Reverse 
{
	public static String removeReverse(String S) 
    { 
		HashMap<Character,Integer> map = new HashMap<Character, Integer>();
		for(char i:S.toCharArray())
			map.put(i, map.getOrDefault(i, 0)+1);
		boolean flag=true;
		char arr[]=S.toCharArray();
		int i=0,j=S.length()-1,count=0;
		while(i<j)
		{
//			Delete from front
			if(flag)
			{
				char temp = arr[i];
				if(map.get(temp)>1)
				{
					map.put(temp, map.get(temp)-1);
					arr[i]='*';
					flag=!flag;
					++count;
				}
				++i;
			}
//			Delete from back
			else
			{
				char temp = arr[j];
				if(map.get(temp)>1)
				{
					map.put(temp, map.get(temp)-1);
					arr[j]='*';
					flag=!flag;
					++count;
				}
				--j;
			}
		}
		StringBuilder ans = new StringBuilder();
		for(char k:arr)
			if(k!='*')
				ans.append(k);
		if(count%2!=0)
			ans.reverse();
		return ans.toString();
    }
	public static void main(String[] args)
	{
		System.out.println(removeReverse("abab"));
	}

}
