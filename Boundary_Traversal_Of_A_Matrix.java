package cp;
import java.util.*;
public class Boundary_Traversal_Of_A_Matrix
{
	static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m)
    {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		if(n==1)
			for(int i=0;i<m;i++)
				ans.add(matrix[0][i]);
		else if(m==1)
			for(int i=0;i<n;i++)
				ans.add(matrix[i][0]);
		else
		{
			for(int i=0;i<m;i++)
				ans.add(matrix[0][i]);
			for(int i=1;i<n;i++)
				ans.add(matrix[i][m-1]);
			for(int i=m-2;i>=0;i--)
				ans.add(matrix[n-1][i]);
			for(int i=n-2;i>=1;i--)
				ans.add(matrix[i][0]);
		}
		return ans;
    }
	public static void main(String[] args) 
	{
		int matrix[][] = {{1, 2, 3, 4},
		         {5, 6, 7, 8},
		         {9, 10, 11, 12},
		         {13, 14, 15,16}};
		System.out.println(boundaryTraversal(matrix,4,4));
	}

}
