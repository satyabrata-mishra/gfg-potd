package cp;
import java.util.*;
public class First_non_repeating_character_in_a_stream 
{
	public static String FirstNonRepeating(String A)
    {
		int freq[]=new int[26];
		char str[]=A.toCharArray();
		Queue<Character> q = new LinkedList<Character>();
		StringBuilder ans=new StringBuilder();
	    for(int i = 0; i< A.length(); i++) 
	    {
	    	int temp=str[i]-'a';
	        freq[temp]++;
	        if(freq[temp]==1)
	        	q.add((char)(temp+'a'));
	        while(!q.isEmpty() && freq[q.peek()-'a']!=1)
	        		q.poll();
	        if(q.isEmpty())
	        	ans.append('#');
	        else
	        	ans.append(q.peek());
	    }
	    return ans.toString();
    }
	public static void main(String[] args) 
	{
		System.out.println(FirstNonRepeating("yewaahkpuo"));
		System.out.println(FirstNonRepeating("aabc"));
	}
}