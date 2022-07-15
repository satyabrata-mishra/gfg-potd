package cp;
public class Smallest_Factorial_Number 
{
	 public static int findNum(int n)
	 {
	       int ans = 0 , high = 5*n,low = 1;
	       while(low <= high)
	       {
	           int mid = low + (high-low)/2;
	           int count = 0;
	           for(int i=5; mid/i >= 1; i *= 5)
	               count += mid/i;
	           if(count >= n)
	           {
	               ans = mid;
	               high = mid-1;
	           }
	           else
	               low = mid+1;
	       }
	       return ans;
	 }
	public static void main(String[] args) 
	{
		System.out.println(findNum(6));
	}

}
