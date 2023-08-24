package cp;
public class Surround_the_1_s 
{
	public int  Count(int[][] matrix)
    {
		int r=matrix.length,c=matrix[0].length,ans=0;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(matrix[i][j]==1)
				{
					int zeros=0;
					//Left
					if(i-1>=0 && matrix[i-1][j]==0)
						zeros++;
					//Bottom
					if(j+1<c && matrix[i][j+1]==0)
						zeros++;
					//Right
					if(i+1<r && matrix[i+1][j]==0)
						zeros++;
					//Top
					if(j-1>=0 && matrix[i][j-1]==0)
						zeros++;
					//Top Right Diagonal
					if(i+1<r && j-1>=0 && matrix[i+1][j-1]==0)
						zeros++;
					//Bottom Right Diagonal
					if(i+1<r && j+1<c && matrix[i+1][j+1]==0)
						zeros++;
					//Bottom Left Diagonal
					if(i-1>=0 && j+1<c && matrix[i-1][j+1]==0)
						zeros++;
					//Top Left Diagonal
					if(i-1>=0 && j-1>=0 && matrix[i-1][j-1]==0)
						zeros++;
					if(zeros!=0 && zeros%2==0)
						ans++;
				}
			}
		}
		return ans;
    }
	public static void main(String[] args) 
	{
		int matrix[][]={{1}};
		Surround_the_1_s ob = new Surround_the_1_s();
		System.out.println(ob.Count(matrix));
	}
}