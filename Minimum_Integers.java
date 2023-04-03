package cp;
public class Minimum_Integers 
{
	public static int minimumInteger(int N, int[] A) 
    {
		int min = Integer.MAX_VALUE;
        long sum = 0;
        for(int i : A)
            sum += i;
        for(int X : A)
            if(((long)X*N) >= sum && min > X)
            	min = X;
        return min;
    }
	public static void main(String[] args) 
	{
		int A[] = { 1, 3, 2};
		System.out.println(minimumInteger(A.length,A));
	}

}
