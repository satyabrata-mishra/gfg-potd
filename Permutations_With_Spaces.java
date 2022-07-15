package cp;
import java.util.*;
public class Permutations_With_Spaces 
{
	public static ArrayList<String> permutation(String str)
	{
		ArrayList<String> strs = new ArrayList<String>();
		if (str.length() == 1)
		{
			strs.add(str);
			return strs;
		}
		ArrayList<String> strsTemp= permutation(str.substring(1,str.length()));
		for (int i = 0; i < strsTemp.size(); i++)
		{
			strs.add(str.charAt(0) +strsTemp.get(i));
			strs.add(str.charAt(0) + " " +strsTemp.get(i));
		}
		Collections.sort(strs);
		return strs;
	}
	public static void main(String[] args)
	{
		String s="AB";
		System.out.println(permutation(s));
	}

}
