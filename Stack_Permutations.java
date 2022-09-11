package cp;
import java.util.*;
public class Stack_Permutations 
{
	public static int isStackPermutation(int n, int[] A, int[] B)
    {
		Stack<Integer> st = new Stack<>();
		int j = 0;
		for(int i=0; i<n; i++)
		{
			st.push(A[i]);
			while(!st.isEmpty() && st.peek() == B[j])
			{
				st.pop();
				j++;
			}
		}
		if(st.isEmpty()) 
			return 1;
		else 
			return 0;
    }
	public static void main(String[] args) 
	{
		int A[] = {1,2,3};
		int B[] = {2,1,3};
		System.out.println(isStackPermutation(A.length,A,B));
	}

}
