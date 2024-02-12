package cp;
import java.util.*;
public class Recamans_sequence 
{
	public static ArrayList<Integer> recamanSequence(int n)
	{
		ArrayList<Integer> ans=new ArrayList<Integer>();
		HashSet<Integer> set=new HashSet<>();
		ans.add(0);
		set.add(0);
		for(int i=1;i<n;i++)
		{
			int num=ans.get(i-1)-i;
			if(num<0 || set.contains(num))
			{
				ans.add(ans.get(i-1)+i);
				set.add(ans.get(i-1)+i);
			}
			else
			{
				set.add(num);
				ans.add(num);
			}
		}
		return ans;
    }
	public static void main(String[] args) 
	{
		System.out.println(recamanSequence(15));
	}
}