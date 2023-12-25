package cp;
public class Determinant_Of_A_Matrix
{
	public static int determinantOfMatrix(int matrix[][], int n)
    {
		if(n==2)
            return ((matrix[0][0]*matrix[1][1])-(matrix[1][0]*matrix[0][1]));
        if(n==1)
            return matrix[0][0];
        int mat[][]=new int[n-1][n-1];
        int p=0,sum=0;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
                 p=matrix[0][i];
            else
                 p=-matrix[0][i];
            for(int j=1;j<n;j++)
            {
                for(int k=0;k<n;k++)
                {
                    if(k==i)
                        continue;
                    else if(k>i)
                        mat[j-1][k-1]=matrix[j][k];
                    else
                        mat[j-1][k]=matrix[j][k];
                }
            }
            sum+= p*determinantOfMatrix(mat,n-1);
        }
        return sum;
    }
	public static void main(String[] args)
	{
		int matrix[][]={{1, 0, 2, -1},
	              		{3, 0, 0, 5},
	              		{2, 1, 4, -3},
	              		{1, 0, 5, 0}};
		System.out.println(determinantOfMatrix(matrix,matrix.length));
	}
}