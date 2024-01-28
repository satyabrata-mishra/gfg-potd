package cp;
public class Anti_Diagonal_Traversal_of_Matrix
{
	public static int[] antiDiagonalPattern(int[][] matrix)
    {
		int ans[]=new int[matrix.length*matrix[0].length];
		int i=0,j=0,ind=0;
		while(i<matrix.length && j<matrix[0].length)
		{
			int r=i,c=j;
			while(r<matrix.length && c>=0)
				ans[ind++]=matrix[r++][c--];
			j++;
			if(j==matrix[0].length)
			{
				j=matrix[0].length-1;
				i++;
			}
		}
		System.out.print("Diagonal from first-> ");
		for(int x:ans)
			System.out.print(x+" ");
		System.out.println();
		i=matrix.length-1;
		j=matrix[0].length-1;
		ind=0;
		while(i>=0 && j>=0)
		{
			int r=i,c=j;
			while(r<matrix.length && c>=0)
				ans[ind++]=matrix[r++][c--];
			i--;
			if(i==-1)
			{
				j--;
				i=0;
			}
		}
		return ans;
    }
	public static void main(String[] args) 
	{
		int matrix[][]={{3, 2, 3},
	            		{4, 5, 1},
	            		{7, 8, 9}}; 
//Diagonal from first-> {3},{2,4},{3,5,7},{1,8},{9}
//Diagonal from last -> {9},{1,8},{3,5,7},{2,4},{3}
		int ans[]=antiDiagonalPattern(matrix);
		System.out.print("Diagonal from last-> ");
		for(int i:ans)
			System.out.print(i+" ");
	}
}