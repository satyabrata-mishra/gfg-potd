package cp;
import java.util.*;
public class Unique_Partitions 
{
	public static void solve(int original,int num,ArrayList<Integer> ans,ArrayList<ArrayList<Integer>> res)
	{    
        if(original==0)
        {
            res.add(new ArrayList<>(ans));
            return;
        }
        if(num<=0)
            return;
        
       if(num<=original)
       {
           ans.add(num);
           solve(original-num,num,ans,res);
           ans.remove(ans.size()-1);    
       } 
       solve(original,num-1,ans,res);
    }
	public static ArrayList<ArrayList<Integer>> UniquePartitions(int n)
    {
		ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        solve(n,n,ans,res);
        return res;
    }
	public static void main(String[] args) 
	{
		System.out.println(UniquePartitions(3));
	}

}
