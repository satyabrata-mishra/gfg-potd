package cp;
import java.util.*;
public class Shortest_XY_Distance_In_Grid 
{
	static int shortestXYDist(ArrayList<ArrayList<Character>> grid, int N,int M) 
    { 
        ArrayList<int[]> xvalues = new ArrayList<>();
        ArrayList<int[]> yvalues = new ArrayList<>();
        for(int i=0; i<N; i++)
        {
            for(int j=0; j<M; j++)
            {
                if(grid.get(i).get(j) == 'X')
                {
                	xvalues.add(new int[]{i,j});
                }
                else if(grid.get(i).get(j) == 'Y')
                {
                	yvalues.add(new int[]{i,j});
                }
            }
        }
        int ans = Integer.MAX_VALUE;
        for(int[] arr : xvalues)
            for(int[] arr1 : yvalues)
                ans = Math.min(ans,Math.abs(arr[0]-arr1[0]) + Math.abs(arr[1]-arr1[1]));
        return ans;
    }
	public static void main(String[] args) 
	{
		ArrayList<ArrayList<Character>> input = new ArrayList<ArrayList<Character>>();
		input.add(new ArrayList<Character>(Arrays.asList('X','X','O')));
		input.add(new ArrayList<Character>(Arrays.asList('O','O','Y')));
		input.add(new ArrayList<Character>(Arrays.asList('Y','O','O')));
		System.out.println(shortestXYDist(input,input.size(),3));
	}

}
