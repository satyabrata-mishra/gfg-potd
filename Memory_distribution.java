package cp;
public class Memory_distribution 
{
	public static int Memory(int N, int A, int B, int C)
	{
		int ans=0;
        for(int i=0;i<=N/A;i++)
        {
            for(int j=0;j<=(N-i*A)/B;j++)
            {
                int k=(N-i*A-j*B)/C; // remaining memory after allocating a & b
                if(i*A+j*B+k*C==N) // if sum of those memory == N
                	ans=Math.max(ans,i+j+k); // find max no. of blocks
            }
        }
        return ans;
	}
	public static void main(String[] args) 
	{
		System.out.println(Memory(5, 5, 3, 2));
	}
}