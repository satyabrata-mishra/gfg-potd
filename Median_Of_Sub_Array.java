package cp;
import java.util.*;
public class Median_Of_Sub_Array 
{
	public static long solve(int[] A,int N,int M)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int cur=0;
        long tot=0,ans=0;
        map.put(cur,1);
        for(int i=0;i<N;i++)
        {
            int x;
            if(A[i]>=M) 
                x=1;
            else 
                x=-1;
            if(x==-1) 
                tot-=map.getOrDefault(cur-1,0);
            else 
                tot+=map.getOrDefault(cur,0);
            cur+=x;
            ans+=tot;
            map.put(cur,map.getOrDefault(cur,0)+1);
        }
        return ans;
    }
	public static long countSubarray(int N,int[] A, int M) 
    {
        long v1=solve(A,N,M);
        long v2=solve(A,N,M+1);
        return (v1-v2);
    }
	public static void main(String[] args) 
	{
		int A[] = {2, 1, 3, 5, 4};
		int M = 2;
		System.out.println(countSubarray(A.length,A,M));
	}

}
