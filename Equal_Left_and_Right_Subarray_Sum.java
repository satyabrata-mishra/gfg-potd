package cp;
public class Equal_Left_and_Right_Subarray_Sum 
{
	public static int equalSum(int [] A, int N) 
	{
	    int sum=0;
        for(int i=0;i<N;i++) 
            sum+=A[i];
        int aheadSum=sum,prevSum=0;
        for(int i=0;i<N;i++)
        {
            aheadSum-=A[i];
            if(prevSum==aheadSum) 
                return i+1; // 1 based indexing
            prevSum+=A[i];
        }
        return -1;
	}
	public static void main(String[] args) 
	{
		int A[] = {1,3,5,2,2};
		System.out.println(equalSum(A,A.length));
	}

}
