package cp;
import java.util.*;
public class Remove_The_Balls
{
	public static int finLength(int N, int[] color, int[] radius)
    {
		Stack<int[]> ans = new Stack<int[]>();
		for(int i=0;i<N;i++)
		{
			if(ans.isEmpty())
			{
				ans.add(new int[] {color[i],radius[i]});
				continue;
			}
			if(ans.peek()[0]==color[i] && ans.peek()[1]==radius[i])
				ans.pop();
			else
				ans.add(new int[] {color[i],radius[i]});
		}
		return ans.size();
    }
	public static void main(String[] args)
	{
		int color[] = {1, 3, 3, 1};
		int radius[] = {2, 5, 5, 2};
		System.out.println(finLength(color.length,color,radius));
	}

}
