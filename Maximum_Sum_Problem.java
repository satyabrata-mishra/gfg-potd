package cp;
public class Maximum_Sum_Problem 
{
	public static int maxSum(int n) 
    { 
		int ans[] = new int[n+1];
        for(int i = 1 ; i <= n ; i++)
        ans[i] = Math.max(i , ans[i/2]+ans[i/3]+ans[i/4]);
        return ans[n];
    } 
	public static void main(String[] args) 
	{
		System.out.println(maxSum(12));
		System.out.println(maxSum(24));
	}
}