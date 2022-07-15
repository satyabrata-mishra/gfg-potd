package cp;
import java.util.*;
public class A_Simple_Fraction 
{
	public static String  fractionToDecimal(int numerator, int denominator)
    {
		StringBuilder ans=new StringBuilder();
		int q=numerator/denominator;
		int r=numerator%denominator;
		ans.append(q);
		if(r==0)
			return ans.toString();
		else
		{
			ans.append(".");
			HashMap<Integer,Integer> hm=new HashMap<>();
			while(r!=0)
			{
				if(hm.containsKey(r))
				{
					int l=hm.get(r);
					ans.insert(l,"(");
					ans.append(")");
					break;
				}
				else
				{
					hm.put(r,ans.length());
					r*=10;
					q=r/denominator;
					r=r%denominator;
					ans.append(q);
				}
			}
		}
		return ans.toString();
    }
	public static void main(String[] args)
	{
		System.out.println((double)18/19);
		System.out.println(fractionToDecimal(18,19));
	}

}
