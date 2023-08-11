package cp;

public class Solve_The_Sudoku 
{
	static boolean SolveSudoku(int grid[][])
    {
		for(int i=0;i<grid.length;i++)
		{
			for(int j=0;j<grid[0].length;j++)
			{
				if(grid[i][j]==0)
				{
					for(int d=1;d<=9;d++)
					{
						if(isValid(grid,i,j,d)) 
						{
							grid[i][j]=d;
							if(SolveSudoku(grid))
								return true;
							else
								grid[i][j]=0;
						}
					}
					return false;
				}
			}
		}
		return true;
    }
	static boolean isValid(int grid[][],int r,int c,int d)
	{
		for(int i=0;i<9;i++)
		{
			if(grid[r][i]==d)
				return false;
			if(grid[i][c]==d)
				return false;
			if(grid[3*(r/3)+i/3][3*(c/3)+i%3]==d) //<-- Catch Condition
				return false;
		}
		return true;
	}
	static void printGrid (int grid[][])
    {
        int r = grid.length,c=grid[0].length;
        for(int i=0;i<r;i++)
        {
        	for(int j=0;j<c;j++)
        		System.out.print(grid[i][j]+" ");
        	System.out.println();
        }
    }
	public static void main(String[] args) 
	{
		int grid[][] = 
				{{3, 0, 6, 5, 0, 8, 4, 0, 0},
				 {5, 2, 0, 0, 0, 0, 0, 0, 0},
				 {0, 8, 7, 0, 0, 0, 0, 3, 1},
				 {0, 0, 3, 0, 1, 0, 0, 8, 0},
				 {9, 0, 0, 8, 6, 3, 0, 0, 5},
				 {0, 5, 0, 0, 9, 0, 6, 0, 0},
				 {1, 3, 0, 0, 0, 0, 2, 5, 0},
				 {0, 0, 0, 0, 0, 0, 0, 7, 4},
				 {0, 0, 5, 2, 0, 6, 3, 0, 0}};
		boolean b = SolveSudoku(grid);
		System.out.println(b);
		if(b)
			printGrid(grid);
	}
}