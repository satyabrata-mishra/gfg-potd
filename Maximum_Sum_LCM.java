package cp;
public class Maximum_Sum_LCM 
{
	public static long maxSumLCM(int n) 
    {
		long res=0;
        for(int i=1;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                int a=n/i;
                if(a==i)
                    res+=(long)i;
                else
                    res+=(long)i+(long)a;
            }
        }
        return res;
    }
	public static void main(String[] args) 
	{
		System.out.println(maxSumLCM(2));
	}

}
