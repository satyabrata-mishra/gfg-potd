//A number n is called Bleak if it cannot be represented as sum of a 
//positive number x and set bit count in x, i.e., x + countSetBits(x) is 
//not equal to n for any non-negative number x.
package cp;
public class Bleak_Number 
{
	public static int is_bleak(int n)
    {
		 for(int j=Math.max(0,n-31);j<=n;j++)
			 if(Integer.bitCount(j)+j==n) 
				 return 0;
		 return 1;
    }
	public static void main(String[] args) 
	{
		System.out.println(is_bleak(4));
		System.out.println(is_bleak(3));
	}
}