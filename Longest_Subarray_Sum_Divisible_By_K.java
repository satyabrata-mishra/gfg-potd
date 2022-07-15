package cp;
import java.util.*;
public class Longest_Subarray_Sum_Divisible_By_K 
{
	public static int sum(ArrayList<Integer> a)
	{
		int sum=0;
		for(int i:a)
			sum+=i;
		return Math.abs(sum);
	}
	public static int longSubarrWthSumDivByK(int a[], int n, int k)
    {
        int l = -1;
        for(int i=0;i<n;i++)
        {
        	for(int j=i;j<n;j++)
        	{
        		ArrayList<Integer> al = new ArrayList<Integer>();
        		for(int z=i;z<=j;z++)
        			al.add(a[z]);
        		if((sum(al) % k ==0) && (al.size()>l))
        			l = al.size();
        	}
        }
        return l;
       
    }
	public static void main(String[] args)
	{
		int A[] = {1, 2 ,-2, 2, 2};
		int k = 3;
		System.out.println(longSubarrWthSumDivByK(A , A.length , k));
	}

}
