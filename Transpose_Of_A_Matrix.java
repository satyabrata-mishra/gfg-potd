package cp;

public class Transpose_Of_A_Matrix 
{
	public static void transpose(int n,int a[][])
    {
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
    }
	public static void main(String[] args) 
	{
		int mat[][] = {{1, 1, 1, 1},
		           		{2, 2, 2, 2},
		           		{3, 3, 3, 3},
		           		{4, 4, 4, 4}};
		transpose(mat.length,mat);
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat.length;j++)
				System.out.print(mat[i][j]+" ");
			System.out.println();
		}
	}

}
