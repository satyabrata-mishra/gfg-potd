package cp;
public class Equilibrium_Point 
{
	public static int equilibriumPoint(long arr[], int n) 
    {
		long sum=0,sum1=0;
		for(long i:arr)
			sum+=i;
		for(int i=0;i<n;i++)
		{
			sum-=arr[i];			
			if(sum1==sum)
				return i+1;
			sum1+=arr[i];
		}
		return -1;
    }
	public static void main(String[] args) 
	{
		long A[] = {1,3,5,2,2} ;
		System.out.println(equilibriumPoint(A,A.length));
	}
}