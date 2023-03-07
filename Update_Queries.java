package cp;

public class Update_Queries 
{
	public static int[] updateQuery(int N, int Q, int [][]U)
	{
		int help[][]=new int[N+1][20];
		for(int i[]:U)
		{
			int l = i[0],r=i[1],x=i[2],ind=0;
			while(x!=0)
			{
				if(x%2==1)
				{
					help[l-1][ind]++;
					help[r][ind]--;
				}
				ind++;
				x/=2;
			}
			
		}
		for(int i=0;i<20;i++)
			for(int j=1;j<N;j++)
				help[j][i]+=help[j-1][i];
		int ans[]=new int[N];
		for(int i=0;i<N;i++)
		{
			int val=0;
			for(int j=0;j<20;j++)
			{
				if(help[i][j]>0)
					val+=(1<<j);
			}
			ans[i]=val;
		}
		return ans;
    }
	public static void main(String[] args)
	{
		int U[][]= {{1, 2, 1},{3, 3, 2}};
		int ans[] = updateQuery(3,U.length,U);
		for(int i:ans)
			System.out.print(i+" ");
	}

}
