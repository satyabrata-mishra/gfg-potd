package cp;
import java.util.*;
public class Print_The_Pattern 
{
	public static List<String> pattern(int n)
    {
		List<String> ans = new ArrayList<String>();
		int a[]=new int[(n*n)+n+1];
		for(int i=1;i<=(n*n)+n;i++)
			a[i]=i;
		int low = 1,high=(n*n)+n;
		for(int i=n;i>0;i--)
		{
			String right = "";
			for(int j=1;j<=i;j++)
				right+=""+a[low++]+"*";
			String left = "";
			for(int j=1;j<=i;j++)
				left="*"+a[high--]+left;
			String temp = right.substring(0,right.length()-1)+left;
			String hypen="";
			for(int j=i;j<n;j++)
				hypen += "--";
			ans.add(hypen+temp);
		}
		return ans;
    }
	public static void main(String[] args) 
	{
		List<String> ans = pattern(3);
		for(String i:ans)
			System.out.println(i);
	}

}
