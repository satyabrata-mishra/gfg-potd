package cp;
import java.util.*;
public class Distinct_Difference 
{
	public static ArrayList<Integer> getDistinctDifference(int N, int[] A) 
    {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		HashSet<Integer> set = new HashSet<Integer>();
		int leftDistinct[]=new int[N];
		int rightDistinct[]=new int[N];
		for(int i=0;i<N;i++)
		{
			leftDistinct[i]=set.size();
			set.add(A[i]);
		}
		set.clear();
		for(int i=N-1;i>=0;i--)
		{
			rightDistinct[i]=set.size();
			set.add(A[i]);
		}
		for(int i=0;i<N;i++)
			ans.add(leftDistinct[i]-rightDistinct[i]);
		return ans;
    }
	public static void main(String[] args) 
	{
		int arr[] = {4, 4, 3, 3};
		System.out.println(getDistinctDifference(arr.length,arr));
	}

}
