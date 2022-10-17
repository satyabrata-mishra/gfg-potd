package cp;
import java.util.*;
public class Number_Of_Islands 
{
	public static void dfs(int[][] grid, int r, int c, int m, int n, boolean[][] visited) 
	{
        if (r >= 0 && r < m && c >= 0 && c < n && grid[r][c] == 1 && !visited[r][c]) 
        {
            visited[r][c] = true;
            dfs(grid, r + 1, c, m, n, visited);
            dfs(grid, r - 1, c, m, n, visited);
            dfs(grid, r, c + 1, m, n, visited);
            dfs(grid, r, c - 1, m, n, visited);
        } 
        else 
            return;
    }
	public static int numOfIslandsHelper(int[][] grid, int m, int n, boolean[][] visited) 
	{
        int islands = 0;
        for (int i=0; i < m; i++) 
            for (int j=0; j < n; j++) 
                if (grid[i][j] == 1 && !visited[i][j]) 
                {
                    islands++;
                    dfs(grid, i, j, m, n, visited);
                }
        return islands;
    }
	public static List<Integer> numOfIslands(int rows, int cols, int[][] o) 
    {
		List<Integer> ans = new ArrayList<>();
        int[][] grid = new int[rows][cols];
        for (int[] operator : o) 
        {
        	grid[operator[0]][operator[1]] = 1;
            boolean[][] visited = new boolean[rows][cols];
            ans.add(numOfIslandsHelper(grid, rows, cols, visited));
        }
        return ans;
    }
	public static void main(String[] args) 
	{
		int A[][] = {{1,1},{0,1},{3,3},{3,4}};
		System.out.println(numOfIslands(4,5,A));
	}

}
