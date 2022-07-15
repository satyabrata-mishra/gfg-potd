package cp;

public class Matrix_Chain_Multiplication
{
	public static int matrixChainOrder(int p[], int i, int j)
    {
		if (i==j)
			return 0;
		int min = Integer.MAX_VALUE;
		for(int k=i;k<j;k++)
		{
			int temp = matrixChainOrder(p,i,k)+matrixChainOrder(p,k+1,j)+ p[i-1]*p[k]*p[j];
			min = Math.min(min, temp);
		}
		return min;
    }
	public static void main(String[] args) 
	{
		int p[] = {3, 3, 3};
		System.out.println(matrixChainOrder(p , 1 , p.length-1));
	}

}
