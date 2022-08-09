package cp;
import java.util.*;
public class Implement_API_Amazon_Question 
{
	public static ArrayList<String> implementAPI(ArrayList<String> users)
	{
		ArrayList<String> ans = new ArrayList<String>();
		HashMap<String,String> record = new HashMap<String,String>();
		boolean login=false;
		String loginuser = "";
		for(String i:users)
		{
			String str[]=i.split("\\s+");
			if(str[0].equals("register"))
			{
				if(!record.containsKey(str[1]))
				{
					record.put(str[1], str[2]);
					ans.add("Registration Successful");
				}
				else
					ans.add("User Already Exsits");
			}
			else if(str[0].equals("login"))
			{
				if(login==false && loginuser=="" && record.containsKey(str[1]) && record.get(str[1]).equals(str[2]))
				{
						login = true;
						loginuser=str[1];
						ans.add("Login Successful");
				}
				else
					ans.add("Login Unsuccessful");
			}
			else if(str[0].equals("logout"))
			{
				if(login==true && loginuser.equals(str[1]))
				{
					login=false;
					loginuser="";
					ans.add("Logout Successful");
				}
				else
					ans.add("Logout Unsuccessful");
			}
		}
		return ans;
	}
	public static void main(String[] args) 
	{
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("register david david123");
		ar.add("register david david123");
		ar.add("register adam 1Adam1");
		ar.add("login david david123");
		ar.add("login adam 1adam1");
		ar.add("logout david");
		ar=implementAPI(ar);
		for(String i:ar)
			System.out.println(i);
	}

}
