package cp;
import java.util.*;
public class Word_Break 
{
	public static void rec(int ind, String temp, String s, List<String> dict, List<String> ans)
    {
        if(ind==s.length())
            ans.add(temp);
        for(int i=ind; i<s.length(); i++)
        {
            String part = s.substring(ind, i+1);
            if(dict.contains(part))
                rec(i+1, temp + part + (i+1==s.length() ? "" : " "), s, dict, ans);
        }
    }
	public static List<String> wordBreak(int n, List<String> dict, String s)
    {
        List<String> ans = new ArrayList<>();
        rec(0,"", s, dict, ans);
        return ans;
    }
	public static void main(String[] args)
	{
		ArrayList<String> s = new ArrayList<>();
		s.add("cats");
		s.add("cat");
		s.add("and");
		s.add("sand");
		s.add("dog");
		String str = "catsanddog";
		System.out.println(wordBreak(s.size(), s , str));
	}

}
