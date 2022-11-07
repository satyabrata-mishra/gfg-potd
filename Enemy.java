package cp;
public class Enemy 
{
	public static int largestArea(int n,int m,int k,int[][] enemy) 
    {
		boolean[] row = new boolean[n];
        boolean[] col = new boolean[m];
        for(int i = 0; i < k; i++ )
        {
            row[enemy[i][0]-1] = true;
            col[enemy[i][1]-1] = true;
        }
        int maxR = 0, maxC = 0, temp = 0;
        for(int i = 0; i < n; i++ )
            if(row[i])
            {
            	maxR = Math.max(temp, maxR);
            	temp = 0;            	
            }
            else
            	temp += 1;     
        maxR = Math.max(temp, maxR);
        temp = 0;
        for(int i = 0; i < m; i++ )
            if(col[i])
            {
            	maxC = Math.max(temp, maxC);
            	temp = 0;            	
            }
            else
            	temp += 1;     
        maxC = Math.max(temp, maxC);
        return maxC*maxR;
    }
	public static void main(String[] args) 
	{ 
		int N = 3;
		int M = 3;
		int K = 1;
		int enemy[][]={{3,3}};
		System.out.println(largestArea(N,M,K,enemy));
	}

}
