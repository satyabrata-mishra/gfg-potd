package cp;
import java.util.*;
public class K_largest_elements 
{
	public static int[] kLargest(int[] arr, int n, int k) 
    {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		for(int i:arr)
			pq.add(i);
		int ans[]=new int[k];
		for(int i=0;i<k;i++)
			ans[i]=pq.poll();
		return ans;
    }
	public static void main(String[] args) 
	{
		int arr[] = {12, 5, 787, 1, 23};
		int k = 2;
		int ans[]=kLargest(arr,arr.length,k);
		for(int i:ans)
			System.out.print(i+" ");
	}
}