package cp;
public class Total_Cuts 
{
	public static int totalCuts(int N, int K, int[] A) 
    {
		int largeLeft[]=new int[N];
		largeLeft[0]=A[0];
		for(int i=1;i<N;i++)
			largeLeft[i]=Math.max(A[i], largeLeft[i-1]);
		int smallRight[]=new int[N];
		smallRight[N-1]=A[N-1];
		for(int i=N-2;i>=0;i--)
			smallRight[i]=Math.min(A[i], smallRight[i+1]);
		int count=0;
		for(int i=0;i<N-1;i++)
			if(largeLeft[i]+smallRight[i+1]>=K)
				++count;
		return count;
    }
	public static void main(String[] args) 
	{
		int A[]={1,2,3,4,5},K=5;
		System.out.println(totalCuts(A.length,K,A));
	}
}