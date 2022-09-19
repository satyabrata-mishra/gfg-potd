package cp;

public class Minimum_Swaps 
{
	public static int minimumSwaps(int[] c, int[] v,int n,int k,int b,int t) 
    {
		int slow=0;
        int NoOfSwaps=0;
        for(int i=n-1;i>=0;i--)
        {
            int pos=c[i]+(v[i]*t);
            if(pos>=b)
            {
                k--;
                NoOfSwaps+=slow;
                if(k==0)return 
                    NoOfSwaps;

            }
            else
                slow++;
        }
        return -1;
    }
	public static void main(String[] args) 
	{
		int k=3;
		int B=10;
		int T=5;
		int POS[]={0,2,5 ,6, 7};
		int V[]={1,1,1,1,4};
		System.out.println(minimumSwaps(POS,V,V.length,k,B,T));

	}

}
