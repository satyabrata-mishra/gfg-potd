package cp;
import java.util.*;
public class Minimum_Sum_of_Absolute_Differences_of_Pairs
{
	public static long findMinSum(int[] A,int[] B,int N) 
    { 
        Arrays.sort(A);
        Arrays.sort(B);
        long sum = 0;
        for(int i=0;i<N;i++)
        	sum+=Math.abs(A[i]-B[i]);
        return sum;
    }
	public static void main(String[] args) 
	{
		int A[] = {4,1,8,7};
		int B[] = {2,3,6,5};
		System.out.println(findMinSum(A,B,A.length));
	}

}
