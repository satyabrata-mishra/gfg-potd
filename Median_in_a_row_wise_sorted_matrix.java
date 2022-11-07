package cp;
import java.util.*;
public class Median_in_a_row_wise_sorted_matrix 
{
	public static int median(int matrix[][], int R, int C) 
    {
		int a[] = new int[R*C];
		int size =0;
		for(int i =0; i<R;i++)
			for(int j =0; j<C;j++)
				a[size++] = matrix[i][j];
	       Arrays.sort(a);
	       return( a[(((R*C)+1)/2)-1]);
    }
	public static void main(String[] args) 
	{
		int M[][] = {{1, 3, 5}, {2, 6, 9}, {3, 6, 9}};
		System.out.println(median(M,3,3));
	}

}
