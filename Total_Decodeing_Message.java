package cp;
import java.util.*;
public class Total_Decodeing_Message 
{
	public static int CountWays(String str)
    {
		int n = str.length();
		for(int i=0;i<n;i++)
		{
			int temp = Character.getNumericValue(str.charAt(i));
			if(temp==0)
				return 0;
		}
		int count=1;
		for(int i=1;i<=n;i++)
		{
			String s1 = str.substring(0,i);
			String s2 = str.substring(i,n);
			if(s2.isBlank())
				continue;
			int t=Integer.parseInt(s1);
			int t2=Integer.parseInt(s2);
			if((t>=1 && t<=26) && (t2>=1 && t2<=26))
				count=(count+1)%1000000009;
			System.out.println(s1+" "+s2);
		}
		return count%1000000009;
    }
	public static void main(String[] args) 
	{
		System.out.println(CountWays("91538633"));
	}

}