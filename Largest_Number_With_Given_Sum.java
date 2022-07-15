package cp;

public class Largest_Number_With_Given_Sum 
{
	 public static String largestNumber(int n, int s)
	 {
		 if((n*9)<s)
	            return "-1";
		 String ans="";
	       for (int i=0; i<n; i++)
	            if (s >= 9)
	            {
	                ans+=9;
	                s -= 9;
	            }
	            else
	            {
	                ans+= s;
	                s = 0;
	            }
	       return ans;
	 }
	public static void main(String[] args)
	{
		System.out.println(largestNumber(5,12));

	}

}
