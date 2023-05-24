package cp;
import java.util.*;
public class Minimize_Overlapping_Intervals
{
	public static ArrayList<int[]> kthSmallestNum(int n, int[][] range) 
    {
		Arrays.sort(range,(a,b)->a[0]- b[0]);
		ArrayList<int[]> list = new ArrayList<int[]>();
		int min=range[0][0],max=range[0][1];
		for(int i=1;i<n;i++)
		{
			if(range[i][0]>=min && range[i][0]<=max)
				max=Math.max(max, range[i][1]);
			else
			{
				list.add(new int[]{min,max});
				min=range[i][0];
				max=range[i][1];
			}
		}
		list.add(new int[]{min,max});
		return list;
    }
	public static void main(String[] args) 
	{
		int range[][] = {{1,4}, {3,7},{2,4},{10,12},{11,17}};
		ArrayList<int[]> arr = kthSmallestNum(range.length,range);
		for(int i[]:arr)
			System.out.println(i[0]+" "+i[1]);
	}
}