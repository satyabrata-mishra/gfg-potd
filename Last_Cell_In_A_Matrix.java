package cp;
public class Last_Cell_In_A_Matrix 
{
	static int [] endPoints(int [][]matrix, int R, int C)
    {
		int i=0,j=0;
		boolean right=true,left=false,up=false,buttom=false;
		while(i<R && j<C && i>=0 && j>=0)
		{
			if(matrix[i][j]==0)
			{
				if(right)
					j++;
				else if(buttom)
					i++;
				else if(up)
					i--;
				else
					j--;
			}
			else
			{
				matrix[i][j]=0;
				if(up)
				{
					up=false;
					right=true;
				}
				else if(right)
				{
					right=false;
					buttom=true;
				}
				else if(buttom)
				{
					buttom=false;
					left=true;
				}
				else
				{
					left=false;
					up=true;
				}
			}
		}
		if(up)
			i++;
		else if(buttom)
			i--;
		else if(right)
			j--;
		else 
			j++;
		int arr[]= {i,j};
		return arr;
    }
	public static void main(String[] args) 
	{
		int matrix[][] = {{0, 1, 1, 1, 0},{1, 0, 1, 0, 1},{1, 1, 1, 0, 0}};
		int r=3,c=5;
		int arr[]=endPoints(matrix,r,c);
		for(int i:arr)
			System.out.print(i+" ");
	}
}
