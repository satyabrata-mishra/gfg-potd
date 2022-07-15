package cp;

public class Tricky_Subset_Problem 
{
	public static int isPossible(long S, int N, long X, long A[])
    {
		long paper[] = new long[N+1];
        paper[0] = S;
        long sum = S;
        for(int i=0;i<N;i++)
        {
            paper[i+1] = sum + A[i];
            if(paper[i+1] >= X) 
            	break;
            sum += paper[i+1];
        }
        int i=paper.length-1;
        while(i>=0 && X>0)
        {
            if(X>=paper[i])
                X-=paper[i];
            i--;
        }
        if(X == 0) 
        	return 1;
        return 0;
    }
	public static void main(String[] args) 
	{
		long S = 1, X = 7;
		long A[] = {1, 2, 4, 2};
		int a=isPossible(S,A.length,X,A);
		if(a==1)
			System.out.println("YES");
		else
			System.out.println("No");
	}

}
