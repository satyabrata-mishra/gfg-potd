package trial;
import java.util.*;
public class Search_Pattern
{
	public static ArrayList<Integer> search(String S,String pat)
	   {
	       ArrayList<Integer> al = new ArrayList<>();
	       int start = 0, end = pat.length();
	       while(true)
	       {
	    	   if(end-1==S.length())
	        	   break;
	    	   else if (S.substring(start++, end++).equals(pat))
	               al.add(start);
	       }
	       return al;
	   }
	public static void main(String[] args)
	{
		ArrayList<Integer> a=new ArrayList<Integer>();
		a=search("geeksforgeeks","geek");
		if(a.size()==0)
			System.out.println("Pattern Not Found!!!");
		else
			System.out.println(a);
	}
}
