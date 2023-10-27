package cp;
public class Boolean_Matrix 
{
	static void booleanMatrix(int matrix[][]) 
	{
		int r = matrix.length,c= matrix[0].length;
        int row[] = new int[r];
        int col[] = new int[c];
        for(int i = 0; i < r; i++)
            for(int j = 0; j < c; j++)
                if(matrix[i][j] == 1)
                {
                    row[i] = 1;
                    col[j] = 1;
                }  
        
        for(int i =0; i < r; i++)
            for(int j = 0; j < c; j++)
                if(row[i] == 1 || col[j] == 1)
                    matrix[i][j] = 1;
    }
	public static void main(String[] args) 
	{
		int matrix[][] ={{1, 0},
	              		{0, 0}};
		booleanMatrix(matrix);
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[0].length;j++)
				System.out.print(matrix[i][j]+" ");
			System.out.println();
		}
	}
}