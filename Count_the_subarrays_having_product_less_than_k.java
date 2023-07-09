package cp;
public class Count_the_subarrays_having_product_less_than_k
{
	public static int countSubArrayProductLessThanK(long a[], int n, long k)
    {
		int ans=0;
        long prod=1;
        for(int j=0,i=0;j<n;j++)
        {
        	prod*=a[j];
        	while(prod>=k && i<j)
        		prod/=a[i++];
        	if(prod<k)
        		ans+=j-i+1;
        }
        return ans;
    }
	public static void main(String[] args) 
	{
		long a[] = {1, 2, 3, 4};
		int k=10;
		System.out.println(countSubArrayProductLessThanK(a,a.length,k));
	}
}