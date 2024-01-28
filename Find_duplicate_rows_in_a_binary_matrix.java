package cp;
import java.util.*;
public class Find_duplicate_rows_in_a_binary_matrix 
{
	public static ArrayList<Integer> repeatedRows(int matrix[][], int m, int n)
    {
        ArrayList<Integer> ans=new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> temp=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<m;i++)
        {
        	ArrayList<Integer> list=new ArrayList<Integer>();
        	for(int j=0;j<n;j++)
        		list.add(matrix[i][j]);
        	if(temp.contains(list))
        		ans.add(i);
        	else
        		temp.add(list);
        }
        return ans;
    }
	public static void main(String[] args) 
	{
		int matrix[][]={{1,0,0},
	            		{1,0,0},
	            		{0,0,0},
	            		{0,0,0}};
		System.out.println(repeatedRows(matrix,matrix.length,matrix[0].length));
	}
}