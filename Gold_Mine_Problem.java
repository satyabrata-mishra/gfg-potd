package cp;
public class Gold_Mine_Problem 
{
	public static int maxGold(int n, int m, int M[][])
    {
		int Max = 0;
        for(int j=1; j<m; j++)
        {
            for(int i=0; i<n; i++)
            {
                int mx = Integer.MIN_VALUE;
                
                if(i-1 >= 0 && j-1 >= 0)
                    mx = Math.max(mx,M[i-1][j-1]);
                
                if(j-1 >= 0)
                    mx = Math.max(mx,M[i][j-1]);
                
                if(i+1<n && j-1 >= 0)
                    mx = Math.max(mx,M[i+1][j-1]);
                
             M[i][j] += mx;   
             Max = Math.max(Max,M[i][j]);
           }
        }
      return Max;
    }
	public static void main(String[] args) 
	{
		int M[][]={{1, 3, 3},
					{2, 1, 4},
			     	{0, 6, 4}};
		System.out.println(maxGold(M.length, M[0].length, M));
	}
}