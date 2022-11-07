package cp;
import java.util.*;
public class Minimum_Numbers_Of_Coins 
{
	static List<Integer> minPartition(int n)
    {
		List<Integer> ans = new ArrayList<Integer>();
		int changes[] = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 };
		int i = 9;
		while(n!=0)
		{
			if(changes[i]<=n)
			{
				ans.add(changes[i]);
				n-=changes[i];
			}
			else
				--i;
		}
		return ans;
    }
	public static void main(String[] args) 
	{
		System.out.println(minPartition(1000));
	}

}
