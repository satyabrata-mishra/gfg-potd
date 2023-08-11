package cp;
import java.util.*;
public class Chocolate_Distribution_Problem 
{
	public static long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
		Collections.sort(a);
		int i=0,j=i+m-1;
		long ans=Long.MAX_VALUE;
		while(j<n)
		{
			ans=Math.min(ans, a.get(j)-a.get(i));
			i++;
			j++;
		}
		return ans;
    }
	public static void main(String[] args) 
	{
		int M = 3;
		int A[] = {7, 3, 2, 4, 9, 12, 56};
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i:A)
			list.add(i);
		System.out.println(findMinDiff(list,A.length,M));
	}
}