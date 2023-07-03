package cp;
public class Is_Binary_Number_Multiple_of_3 
{
	public static int isDivisible(String s) 
    {
        int odd=0,eve=0;
	    for(int i=0;i<s.length();i++)
	    {
	        if(s.charAt(i)=='1')
	        {
	            if(i%2!=0)
	                odd++;
	            else
	                eve++;
	        }
	    }
	    return (odd-eve)%3==0?1:0;
    }
	public static void main(String[] args) 
	{
		System.out.println(isDivisible("0011"));
	}
}