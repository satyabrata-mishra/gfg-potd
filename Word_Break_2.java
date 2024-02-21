package cp;
import java.util.*;
public class Word_Break 
{
	public static int wordBreak(int n, String s, ArrayList<String> dictionary )
    {
        if(s.length()==0)
            return 1;
        for(int i=1; i<=s.length(); i++)
            if(dictionary.contains(s.substring(0,i)) && wordBreak(n,s.substring(i),dictionary)==1)
                return 1;
        return 0;
    }
	public static void main(String[] args) 
	{
		String s="ilike";
		ArrayList<String> list=new ArrayList<String>(Arrays.asList("i", "like", "sam", "sung", "samsung", "mobile"));
		System.out.println(wordBreak(list.size(),s,list));
	}
}