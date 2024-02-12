package cp;
import java.util.*;
public class Daily_Tempratures 
{
	public static int[] dailyTemperatures(int[] T) 
	{
		int n = T.length;
	    int[] daysOfWait = new int[n];
	    Arrays.fill(daysOfWait, 0);
	    Stack<Integer> s = new Stack<>();
	    // Traverse all the temperatures
	    for(int i = 0; i < n; i++)
	    {
	         
	        // Check if current index is the
	        // next warmer temperature of
	        // any previous indexes
	        while (!s.isEmpty() && T[s.peek()] < T[i])
	        {
	            daysOfWait[s.peek()] = i - s.peek();
	            // Pop the element
	            s.pop();
	        }
	        s.push(i);
	    }
	    return daysOfWait;
//        1,1,4,2,1,1,0,0
    }
	public static void main(String[] args) 
	{
		int temp[]={73,74,75,71,69,72,76,73};
		for(int i:dailyTemperatures(temp))
			System.out.print(i+" ");
	}
}