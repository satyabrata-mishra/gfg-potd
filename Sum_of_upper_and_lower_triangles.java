package cp;
import java.util.*;
public class Sum_of_upper_and_lower_triangles
{
	static ArrayList<Integer> sumTriangles(int matrix[][], int n)
    {
        int upper_sum=0,lower_sum=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                upper_sum+=matrix[i][j];
                lower_sum+=matrix[j][i];
            }
        }
        return new ArrayList<>(Arrays.asList(upper_sum,lower_sum));
    }
	public static void main(String[] args)
	{
		int mat[][] ={{6, 5, 4},
					  {1, 2, 5},
					  {7, 9, 7}};
		System.out.println(sumTriangles(mat,mat.length));
	}
}