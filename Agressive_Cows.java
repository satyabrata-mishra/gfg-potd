package cp;
import java.util.*;
public class Agressive_Cows 
{
	public static boolean helper(int stalls[],int n,int cows,int minDist)
	{
		int cntcows=1,lastPlacedCow=stalls[0];
		for(int i=1;i<n;i++)
		{
			if(stalls[i]-lastPlacedCow>=minDist)
			{
				++cntcows;
				lastPlacedCow=stalls[i];
			}
		}
		if(cntcows>=cows)
			return true;
		return false;
	}
	public static int solve(int n, int k, int[] stalls) 
    {
        Arrays.sort(stalls);
        int low=1,high=stalls[n-1]-stalls[0]; //1 to 1000000009
        while(low<=high)
        {
        	int mid = (high+low)/2;
        	if(helper(stalls,n,k,mid))
        		low=mid+1;
        	else
        		high=mid-1;
        }
        return high;
    }
	public static void main(String[] args)
	{
		int noOfCows=3;
		int stalls[] = {10, 1, 2, 7, 5};
		System.out.println(solve(stalls.length,noOfCows,stalls));
	}

}
