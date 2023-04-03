package cp;

import java.util.HashMap;

public class Count_the_Substring 
{
	public static int countSubstring(String S) 
    { 
		int arr[]=new int[S.length()];
		for(int i=0;i<arr.length;i++)
		{
			if(Character.isUpperCase(S.charAt(i)))
				arr[i]=1;
			else
				arr[i]=-1;
		}
		int ans=0,sum=0;
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
			if(sum==0)
				++ans;
			if(map.containsKey(sum))
			{
				ans+=map.get(sum);
				map.put(sum, map.get(sum)+1);
			}
			else
				map.put(sum, 1);
		}
		return ans;
    }
	public static void main(String[] args) 
	{
		System.out.println(countSubstring("gEEk"));
	}

}
