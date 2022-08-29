package cp;
import java.util.*;

public class Amazon_Test_Series_Mock_Test_Assesment5_Q2
{
	public static ArrayList<String> getUsernames(int n, ArrayList<String> username)
    {
        ArrayList<String> ans=new ArrayList<>();
        HashMap<String,Integer> res=new HashMap<>();
        for(int i=0;i<n;i++)
        {
        	String temp = username.get(i);
            if(!res.containsKey(temp))
            {
                res.put(temp,-1);
                ans.add(temp);
            }
            else
            {
                String s=temp+(res.get(temp)+1);
                while(ans.contains(s))
                {
                    res.put(temp,res.get(temp)+1);
                    s=temp+(res.get(temp)+1);
                }
                ans.add(s);
                res.put(s,-1);
            }
        } 
        return ans;  
    }
	public static void main(String[] args) 
	{
		ArrayList<String> u = new ArrayList<String>();
		u.add("arigato0");
		u.add("arigato10");
		u.add("arigato");
		u.add("arigato1");
		u.add("arigato1");
		System.out.println(getUsernames(u.size(),u)); 
	}

}
