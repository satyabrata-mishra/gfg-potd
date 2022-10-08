package cp;

public class Count_all_possible_paths_from_top_left_to_bottom_right 
{
	static long[][] dp;
    static long M=1000000007;
    static long solve(int m,int n)
    {
        if(m==0&&n==0)
        return 1;
        if(m<0||n<0)
        return 0;
          if(dp[m][n]!=0)
        return dp[m][n];
       long l1= solve(m-1,n);
       long l2= solve(m,n-1);
       return dp[m][n]=(l1+l2)%M;
    }
	static long numberOfPaths(int m, int n)
    {
		dp=new long[m+1][n+1];
		return solve(m-1,n-1)%M;
    }
	public static void main(String[] args) 
	{
		System.out.println(numberOfPaths(22,11));
	}

}
