package cp;
import java.util.*;
public class Rank_Queries 
{
	public static int[] rankQueries(int marks[], int n, int queries[], int q)
    {
		Arrays.sort(marks);
		int ans[]=new int[q];
		for(int i=0;i<q;i++)
		{
			int low=0,high=n-1,num=queries[i];
			while(low<=high)
			{
				int mid = low + (high-low)/2;
				if(marks[mid]<num)
					low=mid+1;
				else
					high=mid-1;
					
			}
			ans[i]=n-high;
		}
		return ans;
    }
	public static void main(String[] args) 
	{
		int marks[] = {-100, 5, 100} ;
		int queries[] = {-200, 50, 200};
		queries=rankQueries(marks,marks.length,queries,queries.length);
		for(int i:queries)
			System.out.print(i+" ");
	}

}
//4 2 1