package cp;
public class Run_Length_Encoding 
{
	public static String encode(String str)
	{
	    String ans = "";
	    int count=1;
	    for(int i=0;i<str.length()-1;i++)
	    {
	    	if(str.charAt(i)!=str.charAt(i+1))
	    	{
	    		ans+=""+str.charAt(i)+count;
	    		count=1;
	    	}
	    	else
	    		count++;
	    }
	    ans+=""+str.charAt(str.length()-1)+count;
	    return ans;
	}
	public static void main(String[] args) 
	{
		System.out.println(encode("aba"));
	}
}