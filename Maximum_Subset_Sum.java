package cp;
public class Maximum_Subset_Sum 
{
	public static long findMaxSubsetSum(int N, int[] A) 
    {
		long pre=0, cur=0;
        for(int i=0; i<N; i++)
        {
            cur=Math.max(pre+A[i], cur+A[i]);
//            System.out.println("pre = "+pre+" cur = "+cur);
            long temp = pre;
            pre=cur;
            cur=temp;
        }
        return Math.max(pre,cur);
    }
	public static void main(String[] args) 
	{
		int A[] = {-4, -3, -5, -7, 0, -7, 0};
		System.out.println(findMaxSubsetSum(A.length,A));
	}
}