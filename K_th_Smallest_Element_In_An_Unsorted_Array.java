package cp;

import java.util.PriorityQueue;

public class K_th_Smallest_Element_In_An_Unsorted_Array 
{
	public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
		PriorityQueue<Integer> q=new PriorityQueue<Integer>();
		for(int i:arr)
			q.add(i);
		int ans = -1;
		while(k-->0)
			ans=q.poll();
		return ans;
    } 
	public static void main(String[] args) 
	{
		int arr[] = {7, 10, 4, 3, 20, 15};
		int k=3;
		System.out.println(kthSmallest(arr,0,arr.length-1,k));
	}
}