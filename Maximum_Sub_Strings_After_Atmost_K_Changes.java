package cp;
import java.util.*;
public class Maximum_Sub_Strings_After_Atmost_K_Changes 
{
	public static int characterReplacement(String s, int k)
    {
		 	HashMap<Character,Integer> map = new HashMap<>();
	        int n = s.length(),ans=0,j=0,maxFreq=0;
	        for(int i = 0; i<n; i++)
	        {
	            char ch = s.charAt(i);
	            if(map.containsKey(ch))
	                map.put(ch,map.get(ch) + 1);
	            else
	                map.put(ch,1);
	            maxFreq = Math.max(maxFreq,map.get(ch));
	            while(i - j + 1 - maxFreq > k)
	            {
	                char discard = s.charAt(j);
	                int freq = map.get(discard);
	                freq -= 1;
	                map.put(discard,freq);
	                if(freq==0)
	                    map.remove(discard);
	                j++;
	            }
	            ans = Math.max(ans,i - j + 1);
	        }
	        return ans;
    }
	public static void main(String[] args) 
	{
		System.out.println(characterReplacement("ABAB",2));
	}

}
