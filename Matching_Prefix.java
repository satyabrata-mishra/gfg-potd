package cp;
import java.util.*;
public class Matching_Prefix 
{
	public static String matchingPrefix(int N, ArrayList<String> arr)
    {
        HashMap<String,Integer> hs = new HashMap<String,Integer>();
        for(String i:arr)
        {
            String temp = "";
            for(int j=0;j<i.length();j++)
            {
                temp+=i.charAt(j);
                if(hs.containsKey(temp))
                    hs.put(temp,hs.get(temp)+1);
                else
                    hs.put(temp,1);
            }
        }
        int temp = 0;
        for(String i:hs.keySet())
            if(i.length()*hs.get(i)>temp)
                temp=i.length()*hs.get(i);
        ArrayList<String> al1 = new ArrayList<String>();
        for(String i:hs.keySet())
            if(i.length()*hs.get(i)==temp)
                al1.add(i);
        Collections.sort(al1);
        return al1.get(0);
    }
	public static void main(String[] args) 
	{
		ArrayList<String> a = new ArrayList<String>();
		a.add("co");
		a.add("code");
		a.add("studio");
		a.add("codingninjas");
		a.add("coding");
		a.add("debug");
		a.add("coder");
		a.add("cipher");
		System.out.println(matchingPrefix(a.size(),a));
	}

}
