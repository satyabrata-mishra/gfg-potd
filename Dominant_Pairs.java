package cp;
import java.util.*;
public class Dominant_Pairs 
{
	public static int dominantPairs(int n, int[] arr)
    {
		int ans=0;
        int [] A = new int[n/2];
        int [] B = new int[n/2];
        for(int i=0; i<n; i++)
            if(i<n/2)
                A[i] = arr[i];
            else
                B[i-n/2] = arr[i];
        Arrays.sort(A);
        Arrays.sort(B);
        int i= A.length-1;
        int j = B.length-1;
        while(i >= 0 )
        {
            while(j>=0 && A[i] < B[j]*5) 
            	j--;
            ans+=j+1;
            i--;
        }
        return ans;
    }
	public static void main(String[] args)
	{
		int arr[]={10,2,2,1};
		System.out.println(dominantPairs(arr.length,arr));
	}

}
