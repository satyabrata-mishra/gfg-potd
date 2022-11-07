package cp;

public class Floyd_Warshall 
{
	public static void shortest_distance(int[][] matrix)
    {
		int n = matrix.length;
        for(int k=0; k<n; k++)
            for(int j=0; j<n; j++)
                for(int i=0; i<n; i++)
                {
                    if(matrix[i][k]==-1 || matrix[k][j]==-1) 
                    	continue;
                    
                    if(matrix[i][j]==-1 || (matrix[i][j] > matrix[i][k] + matrix[k][j]))
                    {
                        matrix[i][j] = matrix[i][k] + matrix[k][j];
                    }
                }
    }
	public static void main(String[] args) 
	{
		int matrix[][] = {	{0,1,43},
							{1,0,6},
							{-1,-1,0}};
		shortest_distance(matrix);
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix.length;j++)
				System.out.print(matrix[i][j]+" ");
			System.out.println();
		}
	}

}
