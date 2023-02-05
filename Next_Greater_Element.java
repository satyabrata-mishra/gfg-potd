package cp;
import java.util.*;
public class Next_Greater_Element 
{
	public static long[] nextLargerElement(long[] arr, int n) 
    { 
		Stack<Long> stack=new Stack<Long>();
		long ans[]=new long[n];
		for(int i=n-1;i>=0;i--)
		{
			while(stack.size()>0 && stack.peek()<=arr[i])
				stack.pop();
			ans[i]=stack.isEmpty()?-1:stack.peek();
			stack.push(arr[i]);
		}
		return ans;
    }
	public static void main(String[] args) 
	{
		long arr[] = {1, 3, 2, 4};
		arr=nextLargerElement(arr,arr.length);
		for(long i:arr)
			System.out.print(i+" ");
	}

}
