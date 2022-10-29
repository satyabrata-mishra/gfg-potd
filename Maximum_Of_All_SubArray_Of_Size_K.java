package cp;
import java.util.*;
public class Maximum_Of_All_SubArray_Of_Size_K 
{
	static int max(int arr[],int i,int j)
	{
		int ans = Integer.MIN_VALUE;
		for(int x=i;x<j;x++)
			ans=Math.max(ans,arr[x]);
		return ans;
	}
	static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
		ArrayList<Integer> ans = new ArrayList<>();
		int i = 0;
		while(k<=n)
		{
			ans.add(max(arr,i,k));
			++k;++i;
		}
        return ans;
    }
	public static void main(String[] args) 
	{
		int arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6};
		int K = 3;
		System.out.println(max_of_subarrays(arr,arr.length,K));
	}

}
