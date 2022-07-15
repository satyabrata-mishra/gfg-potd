package cp;
public class Jump_Game 
{
	public static int canReach(int[] A, int N) 
	{
		int range = A[0];
        for(int i=1;i<N;i++)
        	if(i<=range)
                range = Math.max(range , i + A[i]);
        if(range  >= N-1)
            return 1;
        return 0;
    }
	public static void main(String[] args) 
	{
		int A[] = {1, 2, 0, 3, 0, 0};
//		int A[] =  {5, 9, 3, 2, 1, 0, 2, 3, 3, 1, 0, 0};
		System.out.println(canReach(A,A.length));
	}

}
