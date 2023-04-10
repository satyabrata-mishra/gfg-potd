package cp;
import java.util.*;
public class Make_The_Array_Beautiful 
{
	public static ArrayList<Integer> makeBeautiful(int[] arr) 
    {
		int n = arr.length;
		Stack<Integer> stack = new Stack<Integer>();
		for(int i=0;i<n;i++)
		{
			if(stack.isEmpty())
			{
				stack.add(arr[i]);
				continue;
			}
			int temp = stack.peek();
			if((arr[i]<0 && temp>=0) || (arr[i]>=0 && temp<0))
				stack.pop();
			else
				stack.add(arr[i]);
		}
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i:stack)
        	ans.add(i);
        return ans;
    }
	public static void main(String[] args) 
	{
		int arr[]= {2, -2, 1, -1};
		System.out.println(makeBeautiful(arr));
	}

}
