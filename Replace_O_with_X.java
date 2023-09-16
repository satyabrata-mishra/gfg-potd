//Logic->Mark all the 'o' as 'k'(any character other than 'o' and 'x') present 
//in the boundaries and all the 'o' attached(left, right, top, bottom) to that.
//->In the matrix 'k' represents that it cannot be converted to 'x', so replace all
//'k' with 'o' else 'x'.
package cp;
public class Replace_O_with_X 
{
	static void dfs(char mat[][],int i,int j)
    {
        if(i<0 || j<0 || i>=mat.length || j>=mat[0].length || mat[i][j]!='O')
            return;
        mat[i][j]='k';
        dfs(mat,i+1,j);
        dfs(mat,i-1,j);
        dfs(mat,i,j+1);
        dfs(mat,i,j-1);
    }
	public static char[][] fill(int n, int m, char a[][])
    {
		for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                if((i==0 ||i==n-1 || j==0||j==m-1)&& a[i][j]=='O')
                    dfs(a,i,j);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(a[i][j]=='k')
                	a[i][j]='O';
                else
                	a[i][j]='X';
            }
        }
        return a;
    }
	public static void main(String[] args) 
	{
		char mat[][] = {{'X', 'X', 'X', 'X'}, 
				       	{'X', 'O', 'X', 'X'}, 
				       	{'X', 'O', 'O', 'X'}, 
				       	{'X', 'O', 'X', 'X'}, 
				       	{'X', 'X', 'O', 'O'}};
		mat=fill(mat.length,mat[0].length,mat);
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[0].length;j++)
				System.out.print(mat[i][j]+" ");
			System.out.println();
		}
	}
}