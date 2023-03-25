package cp;
public class Taxi_Booking 
{
	public static int minimumTime(int N, int cur, int[] pos, int[] time)
    {
		int ans = Integer.MAX_VALUE;
		for(int i=0;i<N;i++)
			ans=Math.min(ans, Math.abs(cur-pos[i])*time[i]);
		return ans;
    }
	public static void main(String[] args) 
	{
		int cur = 4;
		int pos[] = {1, 5, 6};
		int time[] = {2, 3, 1};
		System.out.println(minimumTime(pos.length,cur,pos,time));
	}

}
