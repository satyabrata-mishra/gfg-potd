//Print a sequence of numbers starting with N, without using loop, 
//where replace N with N - 5, until N > 0. After that replace N with 
//N + 5 until N regains its initial value.
package cp;
import java.util.*;
public class Print_Pattern 
{
	int n;
	public void helper(List<Integer> ans,int N,boolean toogle)
	{
		ans.add(N);
		if(toogle)
		{
			if(N<=0)
			{
				helper(ans, N+5,false);
				return;
			}
			helper(ans, N-5,true);
		}
		else
		{
			if(N>=n)
				return;
			helper(ans, N+5,false);
		}
	}
	public  List<Integer> pattern(int N)
    {
		n=N;
		List<Integer> ans=new ArrayList<Integer>();
		if(N<=0)
            ans.add(N);
		else
			helper(ans, N, true);
		return ans;
    }
	public static void main(String[] args) 
	{
		System.out.println(new Print_Pattern().pattern(16)); //16 11 6 1 -4 1 6 11 16
		System.out.println(new Print_Pattern().pattern(10)); //10 5 0 5 10
	}
}