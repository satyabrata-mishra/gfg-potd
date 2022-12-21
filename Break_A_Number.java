//Given a really large number N, break it into 3 whole numbers such that 
//they sum up to the original number and find the number of ways to do so.
//Formula (n+r-1)C(r-1)
package cp;
public class Break_A_Number 
{
	public static int ncr(int n,int r)
	{
		int arr[][]=new int[n+1][r+1];
		for (int i = 0; i <=n; i++) 
			arr[i][0]=1;
		for(int i=1;i<=n;i++)
			for(int j=1;j<=r;j++)
				arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
		return arr[n][r];
	}
	public static int waysToBreakNumber(int N)
    {
		int r=3;
		return ncr(N+r-1,r-1);
    }
	public static void main(String[] args) 
	{
		System.out.println(waysToBreakNumber(3));
	}

}
