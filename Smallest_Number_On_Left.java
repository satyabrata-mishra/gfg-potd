package cp;
import java.util.*;

public class Smallest_Number_On_Left 
{
	public static List<Integer> leftSmaller(int n, int a[])
    {
		List<Integer> ans = new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			for(int j=i-1;j>=-1;j--)
			{
				if(j==-1)
					ans.add(-1);
				else if(a[i]>a[j])
				{
					ans.add(a[j]);
					break;
				}
			}
		}
		return ans;
    }
	public static void main(String[] args) 
	{
		int a[] = {1, 5, 0, 3, 4, 5};
		System.out.println(leftSmaller(a.length,a));
	}

}
