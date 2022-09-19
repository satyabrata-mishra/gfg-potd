package cp;
import java.util.*;
public class Smallest_Subset_With_Greater_Sum 
{
	public static int minSubset(int[] Arr,int N) 
    { 
		int count=1;
        long sum=0,add=0;
        Arrays.sort(Arr);
        for(int i=0;i<N;i++)
            sum=sum+Arr[i];
        for(int i=N-1;i>=0;i--)
        {
            add=add+Arr[i];
            if(add>sum-add)
                return count;
            count++;
        }
        return 0;
    }
	public static void main(String[] args) 
	{
		int a[] = {20, 12, 18, 4};
		System.out.println(minSubset(a,a.length));
	}

}
