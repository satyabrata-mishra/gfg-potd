package cp;
import java.util.*;
public class Print_Matrix_in_snake_Pattern 
{
	public static ArrayList<Integer> snakePattern(int matrix[][])
    {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		boolean toogle=true;
		for(int i=0;i<matrix.length;i++,toogle=!toogle)
		{
			if(toogle)
				for(int j=0;j<matrix.length;j++)
					ans.add(matrix[i][j]);
			else
				for(int j=matrix.length-1;j>=0;j--)
					ans.add(matrix[i][j]);
		}
		return ans;
    }
	public static void main(String[] args) 
	{
		int matrix[][] ={{45, 48, 54},
	             		{21, 89, 87},
	             		{70, 78, 15}};
		System.out.println(snakePattern(matrix));
	}
}