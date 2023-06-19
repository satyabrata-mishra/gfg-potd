package cp;
import java.util.*;
public class Maximum_Diamonds 
{
	static long maxDiamonds(int[] A, int N, int K)
    {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		for(int i:A)
			pq.add(i);
		long ans=0;
		for(int i=0;i<K;i++)
		{
			int num = pq.poll();
			ans+=num;
			pq.add(num/2);
		}
		return ans;
    }
	public static void main(String[] args) 
	{
		int K = 2;
		int A[] = {7,1,2};
		System.out.println(maxDiamonds(A,A.length,K));
	}
}