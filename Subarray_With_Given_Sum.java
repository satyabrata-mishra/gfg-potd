package cp;
import java.util.*;
public class Subarray_With_Given_Sum 
{
	public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                sum+=arr[j];
                if(sum==s)
                {
                    ans.add(i+1);
                    ans.add(j+1);
                    return ans;
                }
                else if(sum>s)
                {
                    sum=0;
                    break;
                }
            }
        }
        ans.add(-1);
        return ans;
    }
	public static void main(String[] args) 
	{
		int arr[] = {1,2,3,7,5};
		int sum = 12;
		System.out.println(subarraySum(arr,arr.length,sum));
	}

}
