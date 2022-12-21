package cp;
import java.util.*;
public class Reorder_List 
{
	public static ArrayList<Integer> reorder(int a[])
	{
		int n = a.length,start=0,end=n-1;
		ArrayList<Integer> ans = new ArrayList<Integer>();
		for(int i=0;i<n;i++)
			if(i%2==0)
				ans.add(a[start++]);
			else
				ans.add(a[end--]);
		return ans;
	}
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5};
		System.out.println(reorder(a));
	}

}
