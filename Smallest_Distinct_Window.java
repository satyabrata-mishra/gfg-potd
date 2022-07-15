package cp;
import java.util.*;
public class Smallest_Distinct_Window 
{
	public static int findSubString( String str)
	{
		HashSet<Character> hs = new HashSet<>();
	       int n = str.length();
	       for(int i=0;i<n;i++)
	       {
	           char ch = str.charAt(i);
	           hs.add(ch);
	       }
	       int max_points = hs.size();
	       int curr_points = 0;
	       int max_len = n;
	       HashMap<Character,Integer> map = new HashMap<>();
	       int i = -1, j = -1;
	       while(true)
	       {
	           boolean flag1 = false;
	           boolean flag2 = false;
	           while(i<n-1)
	           {
	               i++;
	               char ch = str.charAt(i);
	               map.put(ch,map.getOrDefault(ch,0)+1);
	               if(map.get(ch)==1)
	                   curr_points++;
	               if(curr_points==max_points)
	                   break;
	               flag1 = true;
	           }
	           while(j<i && curr_points==max_points)
	           {
	               if(i-j<max_len)
	                   max_len = i - j;
	               j++;
	               char ch = str.charAt(j);
	               map.put(ch,map.getOrDefault(ch,0)-1);
	               if(map.get(ch)==0)
	                   curr_points--;
	               flag2 = true;
	           }
	           if(flag1==false && flag2==false)
	           break;
	       }
	       return max_len;
    }
	public static void main(String[] args)
	{
		System.out.println(findSubString("GEEKSGEEKSFOR"));
	}

}
