package cp;
import java.util.*;
public class Equivalent_Sub_Arrays 
{
	static int countDistinctSubarray(int arr[], int n) 
    { 
		int count = 0;
		ArrayList<Integer> hs = new ArrayList<Integer>();
		for(int i:arr)
			if(!hs.contains(i))
				hs.add(i);
		for(int i=0;i<n;i++)
		{
			ArrayList<Integer> a =new ArrayList<Integer>();
			for(int j=i;j<n;j++)
			{
				a.add(arr[j]);
				int flag = 0;
				for(int x=0;x<hs.size();x++)
					for(int y=0;y<a.size();y++)
						if(!a.contains(hs.get(x)))
						{
							flag=1;
							break;
						}
				if(flag==0)
					++count;
			}
		}
		return count ;
    }
	public static void main(String[] args) 
	{
		int arr[] = {2, 1, 3, 2, 3} ;
		System.out.println(countDistinctSubarray(arr , arr.length));
	}

}
