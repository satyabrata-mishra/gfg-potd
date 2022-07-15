package cp;
import java.util.*;
public class Rank_The_Permutations 
{
	public static ArrayList<String> a = new ArrayList<String>();
	public static void permutations(String str, String q)
	{
		if(str.length()==0)
			a.add(q);
		for(int i=0;i<str.length();i++)
			permutations(str.substring(0,i)+str.substring(i+1),q+str.charAt(i));
	}
	public static long rank(String S)
	{
		permutations(S,"");
		Collections.sort(a);
		return (a.indexOf(S)+1);
	}
	public static void main(String[] args)
	{
		System.out.println(rank("zqh"));
	}

}
