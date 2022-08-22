package cp;
import java.util.*;
public class Fact_Digit_Sum 
{
	public static ArrayList<Integer> FactDigit(int N)
    {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int a[]= {1,1,2,6,24,120,720,5040,40320,362880};
		for(int i=a.length-1;i>0;)
		{
			if(N>=a[i])
			{
				ans.add(i);
				N-=a[i];
			}
			else
				--i;
		}
		Collections.sort(ans);
		return ans;
    }
	public static void main(String[] args) 
	{
		System.out.println(FactDigit(40321));
	}

}
