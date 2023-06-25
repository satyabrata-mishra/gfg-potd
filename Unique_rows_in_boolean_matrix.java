package cp;
import java.util.*;
public class Unique_rows_in_boolean_matrix 
{
	public static ArrayList<ArrayList<Integer>> uniqueRow(int a[][],int r, int c)
    {
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<r;i++)
		{
			ArrayList<Integer> temp = new ArrayList<Integer>();
			for(int j=0;j<c;j++)
				temp.add(a[i][j]);
			if(!ans.contains(temp))
				ans.add(temp);
		}
		return ans;
    }
	public static void main(String[] args) 
	{
		int M[][] = {{1, 1, 0, 1},{1, 0, 0, 1},{1, 1, 0, 1}};
		System.out.println(uniqueRow(M,M.length,M[0].length));
	}
}