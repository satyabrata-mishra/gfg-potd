package cp;
public class Make_Matrix_Beautiful 
{
	public static int findMinOperation(int N, int[][] matrix)
    {
		int max=Integer.MIN_VALUE,ans=0;
		for(int i=0;i<N;i++)
		{
			int sum_r=0,sum_c=0;
			for(int j=0;j<N;j++)
			{
				sum_r+=matrix[i][j];
				sum_c+=matrix[j][i];
			}
			max=Math.max(max,Math.max(sum_r, sum_c));
		}
		for(int i=0;i<N;i++)
		{
			int sum=0;
			for(int j=0;j<N;j++)
				sum+=matrix[i][j];
			ans+=max-sum;
		}
		return ans;
    }
	public static void main(String[] args) 
	{
		int matrix[][]={{1, 2, 3},
	              		{4, 2, 3},
	              		{3, 2, 1}};
		System.out.println(findMinOperation(matrix.length, matrix));
	}
}