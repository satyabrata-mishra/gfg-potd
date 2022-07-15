//Subsequence
package cp;
import java.util.*;
public class Power_Set
{
	public static  List<String> AllPossibleStrings(String s)
    {
        // Code here
        List<String> a = new ArrayList<String>();
        for(int i=1;i<(int)Math.pow(2, s.length());i++)
        {
        	String temp="";
        	String str = Integer.toBinaryString(i);
        	for(int j=0;j<str.length()%s.length();j++)
        		str="0"+str;
        	for(int j=0;j<s.length();j++)
        		if(str.charAt(j)=='1')
        			temp+=s.charAt(j);
        	a.add(temp);
        }
        Collections.sort(a);
        return a;
    }
	public static void main(String[] args)
	{
		String s = "aa";
		List<String> a = AllPossibleStrings(s);
		for(String i:a)
			System.out.print(i+" ");
	}

}
