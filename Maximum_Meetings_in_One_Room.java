package cp;
import java.util.*;
class Interval
{
	int start,finish,index;
	Interval(int start,int finish,int index)
	{
		this.start=start;
		this.finish=finish;
		this.index=index;
	}
}
public class Maximum_Meetings_in_One_Room 
{
	public static ArrayList<Integer> maxMeetings(int N, int[] S, int[] F) 
    {
		Interval ob[]=new Interval[N];
		for(int i=0;i<N;i++)
			ob[i]=new Interval(S[i],F[i],i+1);
		Arrays.sort(ob,(a,b)->a.finish-b.finish);
		ArrayList<Integer> ans=new ArrayList<Integer>();
		int endTime=0;
		for(int i=0;i<N;i++)
		{
			if(ob[i].start>endTime)
			{
				endTime=ob[i].finish;
				ans.add(ob[i].index);
			}
		}
		Collections.sort(ans);
		return ans;
    }
	public static void main(String[] args) 
	{
		int S[] = {1,3,0,5,8,5};
		int F[] = {2,4,6,7,9,9};
		System.out.println(maxMeetings(S.length, S, F));
	}
}