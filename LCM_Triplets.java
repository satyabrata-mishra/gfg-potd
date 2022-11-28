package cp;
public class LCM_Triplets 
{
	public static long lcmTriplets(long N)
    {
		if(N<3)
			return N;
		if(N%2!=0) 
			return N*(N-1)*(N-2);
		else
		{
            if(N%3==0) 
            	return (N-1)*(N-2)*(N-3);
            else
            	return N*(N-1)*(N-3);
		}
    }
	public static void main(String[] args) 
	{
		System.out.println(lcmTriplets(9));
	}

}
