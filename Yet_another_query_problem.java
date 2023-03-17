package cp;
import java.util.*;
public class Yet_another_query_problem 
{
	public static ArrayList<Integer> solveQueries(int N, int num, int[] A, int[][] Q)
    {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int freq[] = new int[N];
		for(int i=0;i<N;i++)
		{
			int count=0;
			for(int j=i;j<N;j++)
				if(A[i]==A[j])
					++count;
			freq[i]=count;
		}
		for(int i=0;i<num;i++)
		{
			int count=0;
			for(int j=Q[i][0];j<=Q[i][1];j++)
				if(freq[j]==Q[i][2])
					count++;
			ans.add(count);
		}
		return ans;
    }
	public static void main(String[] args) 
	{
		int A[]={1,1,3,4,3};
		int Q[][]={{0,2,2},{0,2,1},{0,4,2}};
		System.out.println(solveQueries(A.length,Q.length,A,Q));
	}

}
