//Equilibrium Point in an array is a position such that the sum of elements before it 
//is equal to the sum of elements after it.
package cp;
public class Equlibrium_Point 
{
	public static int equilibriumPoint(long arr[], int n)
    {
		long sum=0;
        for(long i:arr)
            sum+=i;
        long leftsum=0;
        for(int i=0;i<n;i++)
        {
            sum-=arr[i];
            if(sum==leftsum)
                return i+1;
            leftsum+=arr[i];
        }
        return -1;
    }
	public static void main(String[] args) 
	{
		long a[] = {1};
		System.out.println(equilibriumPoint(a,a.length));
	}

}
