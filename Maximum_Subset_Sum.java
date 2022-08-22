package cp;
import java.util.*;
public class Maximum_Subset_Sum 
{
	static int val = 0;
	public static void subsets(int arr[],int i,ArrayList<Integer> cur)
	{
		if(i==arr.length)
		{
			int sum=0;
			for(int x:cur)
				sum+=x;
			if(sum>val)
				val=sum;
			return;
		}
		cur.add(arr[i]);
		subsets(arr,i+1,cur);
		cur.remove(cur.size()-1);
		subsets(arr,i+1,cur);
	}
	public static int subsetSum(int arr[])
	{
		ArrayList<Integer> cur = new ArrayList<Integer>();
		subsets(arr,0,cur);
		return val;
	}
	public static void main(String[] args) 
	{
		int A[] = {0,5,3,1};
		System.out.println(subsetSum(A));
	}

}
