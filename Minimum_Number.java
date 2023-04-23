package cp;
public class Minimum_Number 
{
	public static int gcd(int a,int b)
	{
		if(a==0)
			return b;
		return gcd(b%a,a);
	}
	public static int minimumNumber(int n, int[] arr) 
    {
		if(n==1)
			return arr[0];
		int gcd = gcd(arr[0],arr[1]);
		for(int i=2;i<n;i++)
			gcd=gcd(gcd,arr[i]);
		return gcd;
    }
	public static void main(String[] args) 
	{
		int arr[] = {3,2,4};
		System.out.println(minimumNumber(arr.length,arr));
	}
}
