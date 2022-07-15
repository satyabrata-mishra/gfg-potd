package cp;
import java.util.*;
public class Find_all_possible_paths_from_top_to_bottom 
{
	public static ArrayList<ArrayList<Integer>> hs=new ArrayList<ArrayList<Integer>>();
    public static void solve(int i,int j,ArrayList<Integer> ary,int n,int m,int[][] grid) 
    {
        if(i==n-1 && j==m-1)
        	hs.add(new ArrayList<>(ary));
        if(i+1<n)
        {
           ary.add(grid[i+1][j]);
           solve(i+1,j,ary,n,m,grid);
           ary.remove(ary.size()-1);
        }
        if(j+1<m)
        {
           ary.add(grid[i][j+1]);
           solve(i,j+1,ary,n,m,grid);
           ary.remove(ary.size()-1);
        }
    }
	public static ArrayList<ArrayList<Integer>> findAllPossiblePaths(int n,int m, int[][] grid) 
	{
		int i=0;int j=0;
	    ArrayList<Integer> ary=new ArrayList<>();
	    ary.add(grid[i][j]);
	    solve(i,j,ary,n,m,grid);
	    return hs;
	}
	public static void main(String[] args)
	{
		int grid[][]= {{1,2,3},{4,5,6}};
		System.out.println(findAllPossiblePaths(2,3,grid));
	}

}
