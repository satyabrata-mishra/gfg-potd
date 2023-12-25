package cp;
public class Modified_Game_of_Nim 
{
	public static int findWinner(int n, int A[])
    {
		int XOR=0;
        for(int i=0;i<n;i++)
            XOR ^= A[i];
        if(XOR==0)
        	return 1;
        return n%2==0?1:2;
    }
	public static void main(String[] args) 
	{
		int A[]={3,3,2};
		System.out.println(findWinner(A.length,A));
	}
}