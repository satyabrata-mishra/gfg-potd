package cp;
import java.util.*;
public class Complement 
{
	public static Vector<Integer> findRange(String str, int n) 
    {
		Vector<Integer> ans = new Vector<Integer>();
		int count=0;
		for (int i = 0; i < n; i++) 
			if(str.charAt(i)=='1')
				++count;
		if(count==n)
			ans.add(-1);
		else
		{
//			Typical Form Of Kadane's Algorithm
			int maxsum=0,currentsum=0,start=0,end=0,p=0;
			for (int i = 0; i < n; i++) 
			{
				int num=Character.getNumericValue(str.charAt(i));
				num=num==1?-1:1;
				currentsum+=num;
				if(maxsum<currentsum)
				{
					maxsum=currentsum;
					start=p;
					end=i;
				}
				if(currentsum<0)
				{
					currentsum=0;
					p=i+1;
				}
			}
			ans.add(start+1);
			ans.add(end+1);
		}
		return ans;
    }
	public static void main(String[] args) 
	{
		String str="00100001";
		System.out.println(findRange(str,str.length()));
	}

}
