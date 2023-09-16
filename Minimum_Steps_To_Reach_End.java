package cp;
import java.util.*;
public class Minimum_Steps_To_Reach_End 
{
	int minimumMultiplications(int[] arr, int start, int end) 
	{
        int[] ans = new int[100001];
        Arrays.fill(ans, -1);
        int mod = 100000;
        Queue<Integer> q = new LinkedList<>();
        q.add(start % mod);
        ans[start] = 0;
        while (!q.isEmpty()) 
        {
        	int top = q.poll();
            if (top == end) 
            	return ans[end];
            for (int i = 0; i < arr.length; i++) 
            {
                int pushed = top * arr[i];
                pushed = pushed % mod;
                if (ans[pushed] == -1) 
                {
                    ans[pushed] = ans[top] + 1;
                    q.add(pushed);
                }
            }
        }
        return -1;
	}
	public static void main(String[] args) 
	{
		Minimum_Steps_To_Reach_End ob = new Minimum_Steps_To_Reach_End();
		int arr[] = {2, 5, 7};
		int start = 3, end = 30;
		System.out.println(ob.minimumMultiplications(arr, start, end));
	}
}