package cp;
import java.util.*;
public class Maximum_Intersecting_Lines
{
	public static int maxIntersections(int[][] lines, int N) 
    {
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for(int i=0;i<N;i++)
		{
			map.put(lines[i][0], map.getOrDefault(lines[i][0], 0)+1);
			map.put(lines[i][1]+1, map.getOrDefault(lines[i][1]+1, 0)-1);
		}
		int ans = 0,sum=0;
		for(int i:map.keySet())
		{
			sum+=map.get(i);
			ans=Math.max(ans, sum);
		}
		return ans;
    }
	public static void main(String[] args) 
	{
		int lines[][] = {{1,3}, {2,3}, {1,2}, {4,4}};
		System.out.println(maxIntersections(lines,lines.length));
	}

}
