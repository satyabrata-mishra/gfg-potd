package cp;
public class Akku_And_Binary_Numbers 
{
	 public static long solve(long L, long R)
	 {
		 long ans=0;
		 for(int i=0;i<64;i++)
			 for(int j=i+1;j<64;j++)
				 for(int k=j+1;k<64;k++)
					 if(i!=j && j!=k && k!=i)
					 {
	                    long x = (long) 1<<i;
	                    long y = (long) 1<<j;
	                    long z = (long) 1<<k;
	                    long t = x+y+z;
	                    if(L<=t && t<=R)
	                        ++ans;
					 }
		 return ans;
	 }
	public static void main(String[] args) 
	{
		System.out.println(solve(11,19));
	}

}
