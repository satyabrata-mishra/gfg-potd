package cp;
import java.util.*;
public class Substrings_of_length_k_with_k_1_distinct_elements 
{
	static int countOfSubstrings(String S, int K) 
    {
		int ans = 0;
		HashMap<Character, Integer> map = new HashMap<>();
        int n = S.length();
        for(int i=0; i<K-1; i++)
        {
            char ch = S.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
            System.out.println(map);
        }
        for(int i=K-1; i<n; i++)
        {
            char ch = S.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
            if(map.size()==K-1) 
            	ans++;
            char prev_ch = S.charAt(i-K+1);
            int count = map.get(prev_ch);
            if(count==1) 
            	map.remove(prev_ch);
            else 
            	map.put(prev_ch, count-1);
            System.out.println(map);
        }
        return ans;
    }
	public static void main(String[] args) 
	{
		System.out.println(countOfSubstrings("abcc",2));
	}

}
