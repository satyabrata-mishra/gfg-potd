package cp;

public class Last_Modified_Ball 
{
	public static int solve(int N, int[] A) 
    {
		int lastIndex=N-1;
		while(A[lastIndex]==9)
			--lastIndex;
		return lastIndex+1;
    }
	public static void main(String[] args) 
	{
		int A[] = {1, 9, 9};
		System.out.println(solve(A.length,A));
	}

}
