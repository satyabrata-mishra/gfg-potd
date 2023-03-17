package cp;
public class Binary_matrix_having_maximum_number_of_1s 
{
	public static int[] findMaxRow(int mat[][], int N) 
    {
		int row = 0, i = 0, j = N - 1;
        while (i < N) 
        {
            while (j >= 0 && mat[i][j] == 1) 
            {
                row = i;
                j--;
            }
            ++i;
        }
        return new int[]{row, N - 1 - j}; 
    }
	public static void main(String[] args) 
	{
		int mat[][] =  {{1, 1, 1}, 
	              		{1, 1, 1}, 
	              		{0, 0, 0}};
		int a[]=findMaxRow(mat,mat.length);
		System.out.println("Row Number = "+a[0]);
		System.out.println("Maximum Count = "+a[1]);
	}

}
