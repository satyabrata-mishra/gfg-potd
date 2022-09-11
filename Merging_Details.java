package cp;
import java.util.*;
public class Merging_Details 
{
	public static int[] par;
    public static int find(int x) 
    {
    	if(par[x] == x)
    		return x;
    	return par[x] = find(par[x]);
    }
    public static void merge(int fir, int sec)
    {
    	par[fir] = sec;
    }
	public static List<List<String>> mergeDetails(List<List<String>> details) 
	{
		par = new int[details.size()];
        for(int i = 0; i < par.length; i++)
            par[i] = i;
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < details.size(); i++)
        {
            for(int j = 1; j < details.get(i).size(); j++)
            {
            	String email = details.get(i).get(j);
                if(map.containsKey(email)) 
                {
                	int fir = i;
                	int sec = map.get(email);
                	merge(fir, sec);
                }
                map.put(email, i);
            }
        }
        HashMap<Integer, Integer> pos = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();
        for(int i = 0; i < par.length; i++) 
        {
        	int val = find(i);
        	int newnum = -1;
        	if(pos.containsKey(val))
        		newnum = pos.get(val);
        	else 
        	{
        		newnum = ans.size();
        		ans.add(new ArrayList<>());
        	}
        	for(int j = 1; j < details.get(i).size(); j++) 
        	{
        		String email = details.get(i).get(j);
        		if(ans.get(newnum).contains(email) == false)
        			ans.get(newnum).add(email);
        	}
        	pos.put(val, newnum);
        }
        for(List<String> ls : ans)
        	Collections.sort(ls);
        for(int i = 0; i < par.length; i++) 
        {
        	if(pos.containsKey(find(i))) 
        	{
        		ans.get(pos.get(par[i])).add(0, details.get(i).get(0));
        		pos.remove(par[i]);
        	}
        }
        return ans;
	}
	public static void main(String[] args) 
	{
		List<List<String>> a = new ArrayList<List<String>>();
		List<String> temp = new ArrayList<String>();
		temp.add("John");
		temp.add("johnsmith@mail.com");
		temp.add("john_newyork@mail.com");
		a.add(new ArrayList<String>(temp));
		temp.removeAll(temp);
		temp.add("John");
		temp.add("johnsmith@mail.com");
		temp.add("john00@mail.com");
		a.add(new ArrayList<String>(temp));
		temp.removeAll(temp);
		temp.add("Mary");
		temp.add("mary@mail.com");
		a.add(new ArrayList<String>(temp));
		temp.removeAll(temp);
		temp.add("John");
		temp.add("johnnybravo@mail.com");
		a.add(new ArrayList<String>(temp));
		temp.removeAll(temp);
		a=(mergeDetails(a));
		for(int i=0;i<a.size();i++)
			System.out.println(a.get(i));
	}

}
