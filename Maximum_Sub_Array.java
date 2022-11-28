package cp;
import java.util.*;
public class Maximum_Sub_Array 
{
	public static ArrayList<Integer> findSubarray(int a[], int n) 
    {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int tempsum=0,sum=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]<0)
			{
				if(tempsum>sum)
				{
					sum=tempsum;
					ans=(ArrayList)temp.clone();
				}
				else if(tempsum==sum)
				{
					if(temp.size()>ans.size())
						ans=(ArrayList)temp.clone();
				}
				tempsum=0;
				temp.removeAll(temp);
			}
			else
			{
				temp.add(a[i]);
				tempsum+=a[i];
			}
		}
		if(tempsum>sum)
		{
			sum=tempsum;
			ans=(ArrayList)temp.clone();
		}
		else if(tempsum==sum)
		{
			if(temp.size()>ans.size())
				ans=(ArrayList)temp.clone();
		}
		if(ans.isEmpty())
			ans.add(-1);
		return ans;
    }
	public static void main(String[] args) 
	{
		int a[] = {1, 2, 5, -7, 2, 3};
		System.out.println(findSubarray(a,a.length));
	}

}
