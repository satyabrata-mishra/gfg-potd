package cp;
import java.util.*;
public class Geek_And_String 
{
	static List<Integer> prefixCount(int N, int Q, String li[], String query[])
    {
		List<Integer> ans = new ArrayList<Integer>();
		HashMap<String,Integer> hs = new HashMap<String, Integer>();
		for(String i:li)
		{
			String temp="";
			for(int j=0;j<i.length();j++)
			{
				temp+=i.charAt(j);
				if(hs.containsKey(temp))
					hs.put(temp, hs.get(temp)+1);
				else
					hs.put(temp, 1);
			}
		}
		for(String i:query)
			if(hs.containsKey(i))
				ans.add(hs.get(i));
			else
				ans.add(0);
		return ans;
    }
	public static void main(String[] args) 
	{
		String li[] = {"abracadabra", "geeksforgeeks", 
			      "abracadabra", "geeks", "geeksthrill"};
		String qr[] = {"abr", "geeks", "geeksforgeeks", 
				"ge", "gar"};
		System.out.println(prefixCount(li.length,qr.length,li,qr));
	}

}
