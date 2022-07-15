package cp;
public class Bike_Racing 
{
	public static long buzzTime(long N,long M,long L,long[] H, long[] A)
	{
		long high=Math.max(L,M);
	     long low=0,mid=0,ans=0;
	     while(low<=high)
	       {
	           mid=(low+high)/2;
	           long fast=0;
	           for(int i=0;i<N;i++)
	               if(H[i]+A[i]*mid>=L)
	                   fast+=H[i]+A[i]*mid;
	           if(fast>=M)
	           {
	               ans=mid;
	               high=mid-1;
	           }
	           else
	               low=mid+1;
	       }
	       return ans;
	}
	public static void main(String[] args) 
	{
		long n=3,m=400,l=120;
		long h[]= {20,50,20};
		long a[]= {20,70,90};
		System.out.println(buzzTime(n,m,l,h,a));
	}

}