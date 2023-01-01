package cp;
public class Missing_Number_In_Matrix 
{
	public static long MissingNo(int[][] matrix)
    {
		int row_z=0,col_z=0;
		int n = matrix.length;
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				if(matrix[i][j]==0)
				{
					row_z=i;
					col_z=j;
					break;
				}
		int ind =  row_z+1<n?row_z+1:row_z-1;
		long rowSum=0,zeroRowSum=0;
		for (int j = 0; j < n; j++) 
		{
			zeroRowSum+=matrix[row_z][j];
            rowSum += matrix[ind][j];
		}
		long missingNo=rowSum-zeroRowSum;
		if(missingNo<=0)
			return -1;
		matrix[row_z][col_z]=(int)missingNo;
		if(check(matrix,n,rowSum))
			return missingNo;
		return -1;
    }
	public static boolean check(int matrix[][],int n,long rowSum)
	{
		 //check each row , col
		 for(int i=0;i<n;i++)
		 {
			 int rows = 0,cols = 0;
			 for(int j=0;j<n;j++)
			 {
				 rows += matrix[i][j];
				 cols += matrix[j][i];
			 }
			 if(rows != rowSum || cols != rowSum)
				 return false;
		 }
		 //check both diagonals
		 int dia2 = 0,dia1 = 0;
		 for(int i=0;i<n;i++)
		 {
			 dia1+=matrix[i][i];
			 dia2+=matrix[i][n-i-1];
		 }
		 if(dia1!=rowSum || dia2!=rowSum)
			 return false;
		return true;
	}
	public static void main(String[] args)
	{
		int matrix[][] = {{1, 2, 0}, {3, 1, 2}, {2, 3, 1}};
		System.out.println(MissingNo(matrix));
	}

}
