package cp;

import java.util.Arrays;

public class Minimum_Deletions_To_Make_The_Array_Sorted 
{
	public static int lis(int a[])
	{
		int temp[]=new int[a.length];
		Arrays.fill(temp, 1);
		for(int i=1;i<a.length;i++)
			for(int j=0;j<i;j++)
				if(a[i]>a[j])
					temp[i]=Math.max(temp[i], temp[j]+1);
		int ans = 0;
		for(int i:temp)
			if(i>ans)
				ans=i;
		return ans;
	}
	public static int minDeletions(int a[])
	{
		return a.length - lis(a);
	}
	public static void main(String[] args) 
	{
		int a[]= {30, 40, 2, 5, 1,7, 45, 50, 8};
		System.out.println(minDeletions(a));
	}

}
