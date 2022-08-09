package cp;
import java.util.*;
public class Count_No_Of_Substring 
{
	public static long substrCount (String S, int K) 
    {
		long count=0;
        for(int i=0;i<S.length();i++)
        {
        	ArrayList<Character> a = new ArrayList<Character>(); 
        	for(int j=i;j<S.length();j++)
        	{
        		a.add(S.charAt(j));
            	HashSet<Character> h = new HashSet<Character>(a);
        		if(h.size()==K)
        			++count;
        	}
        }
        return count;
    }
	public static void main(String[] args) 
	{
		System.out.println(substrCount("aba",2));
	}

}
