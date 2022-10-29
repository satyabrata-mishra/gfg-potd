package cp;
import java.util.*;
public class The_Smurfs 
{
	static int minFind(int n, String a[])
    {
		 HashMap<String,Integer> hs = new HashMap<String, Integer>();
		 hs.put("R",0);
		 hs.put("G",0);
		 hs.put("B",0);
		 for(String i:a)
			hs.put(i, hs.get(i)+1);
		if(hs.get("R")%2==hs.get("G")%2 && hs.get("G")%2==hs.get("B")%2)
			return 2;
		else
			return 1;
    }
	public static void main(String[] args) 
	{
		String a[] = {"R" , "G", "B", "R", "B"};
		System.out.println(minFind(a.length,a));
	}
}