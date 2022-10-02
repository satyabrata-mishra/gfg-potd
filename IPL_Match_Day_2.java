package cp;
import java.util.*;
public class IPL_Match_Day_2 
{
	static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) 
    {
		 Queue<Integer> q = new LinkedList<>();
		 int max = Integer.MIN_VALUE;
		 ArrayList<Integer> list = new ArrayList<Integer>();
		 int i = 0 ;
		 for(; i < k; i++)
		 {
			 q.add(arr[i]);
			 max = Math.max(max,arr[i]);
		 }
		 list.add(max);
		 while(i < n)
		 {
			 int firstNum = q.remove();
			 q.add(arr[i]);
			 if(max == firstNum)
			 {
				 max = -1;
				 for(int j = 0; j < k ;j++)
				 {
					 int val = q.remove();
					 max = Math.max(max,val);
					 q.add(val);
				 }
				 list.add(max);    
			 }
			 else
			 {
				 max = Math.max(arr[i],max);
				 list.add(max);
			 }
			 i++;
		 }
		 return list;
    }
	public static void main(String[] args)
	{
		int K = 4;
		int arr[] = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13};
		System.out.println(max_of_subarrays(arr,arr.length,K));
	}
}
