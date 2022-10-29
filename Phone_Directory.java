package cp;
import java.util.*;
public class Phone_Directory 
{
	static ArrayList<ArrayList<String>> displayContacts(int n, 
			String contact[], String s)
	{
		ArrayList<ArrayList<String>> ans = new ArrayList<ArrayList<String>>();
		String prefix="";
		for(int i=0;i<s.length();i++)
		{
			prefix+=s.charAt(i);
			ArrayList<String> temp = new ArrayList<String>();
			for(String j:contact)
				if(j.startsWith(prefix))
					if(!temp.contains(j))
						temp.add(j);
			Collections.sort(temp);
			if(temp.size()==0)
				temp.add("0");
			ans.add(temp);
		}
		return ans;
	}
	public static void main(String[] args) 
	{
		String contact[] = {"geeikistest", "geeksforgeeks", "geeksfortest"};
		String s = "geeips";
		ArrayList<ArrayList<String>> ans=displayContacts(contact.length,contact,s);
		for(ArrayList<String> i:ans)
			System.out.println(i);
	}

}
