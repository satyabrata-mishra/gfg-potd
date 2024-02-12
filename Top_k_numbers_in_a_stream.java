package cp;
import java.util.*;
public class Top_k_numbers_in_a_stream
{
	public static ArrayList<ArrayList<Integer>> kTop(int N, int K, int[] a)
    {
		ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
		HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
		Queue<Integer> heap = new PriorityQueue<>((x,y)->map.get(x)<map.get(y)?1:(map.get(x)==map.get(y)?x-y:-1));
		for(int i=0;i<N;i++)
		{
			map.put(a[i],map.getOrDefault(a[i],0)+1);
			heap.clear();
			heap.addAll(map.keySet());
			int temp=K;
			ArrayList<Integer> temp_list=new ArrayList<Integer>();
			while(!heap.isEmpty() && temp--!=0)
				temp_list.add(heap.poll());
			ans.add(temp_list);
		}
		return ans;
    }
	public static void main(String[] args) 
	{
		int K=4;
		int arr[] = {5, 2, 1, 3, 2};
		System.out.println(kTop(arr.length, K, arr));
	}
}