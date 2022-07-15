package cp;
import java.util.*;
public class Nearly_Sorted
{
	 public static ArrayList <Integer> nearlySorted(int arr[], int n, int k)
	 {
		   ArrayList<Integer> ans = new ArrayList<>();
	       PriorityQueue<Integer> pq = new PriorityQueue<>();
	       for(int i = 0; i < n; i++)
	       {
	           pq.add(arr[i]);
	           if(pq.size()>k)
	               ans.add(pq.poll());
	       }
	       while(!pq.isEmpty())
	           ans.add(pq.poll());
	       return ans;
	 }
	public static void main(String[] args) 
	{
		int arr[] = {3,1,4,2,5}; //6,5,3,2,8,10,9
		int k = 2;
		System.out.println(nearlySorted(arr,arr.length,k));
	}

}
