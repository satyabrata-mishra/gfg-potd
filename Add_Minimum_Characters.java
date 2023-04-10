package cp;

public class Add_Minimum_Characters 
{
	public static int addMinChar(String str)
	{
	    int i=0,j=str.length()-1,ans = 0,n=str.length();
	    while(i<j)
	    {
	    	if(str.charAt(i)==str.charAt(j))
	    	{
	    		i++;
	    		j--;
	    	}
	    	else
	    	{
	    		++ans;
	    		i=0;
	    		j=n-1-ans;
	    	}
	    }
	    return ans;
	}
	public static void main(String[] args) 
	{
		System.out.println(addMinChar("ABCD"));
	}

}
