package cp;
import java.util.*;
public class Powerfull_Integer 
{
	public static int powerfullInteger(int n,int interval[][],int k)
    {
		Map<Integer,Integer> mm = new TreeMap<>();
        for(int i=0;i<n;i++)
        {
            mm.putIfAbsent(interval[i][0],0);
            mm.putIfAbsent(interval[i][1]+1,0);
            mm.put(interval[i][0],mm.get(interval[i][0])+1);
            mm.put(interval[i][1]+1,mm.get(interval[i][1]+1)-1);
        }
        System.out.println(mm);
        int temp=0,ans=-1;
        for (int i:mm.keySet())
        {
            if(temp>=k && mm.get(i)<0)
            	ans=i-1;
            temp+=mm.get(i);
            if(temp>=k)
            	ans=i;
        }
        return ans;
    }
	public static void main(String[] args) 
	{
		int intervals[][]={{1,4},{12,45},{3,8},{10,12}};
		int k = 3;
		System.out.println(powerfullInteger(intervals.length,intervals,k));
	}
}
