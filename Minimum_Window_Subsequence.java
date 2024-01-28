package cp;
public class Minimum_Window_Subsequence 
{
	public static String minWindow(String str1, String str2) 
	{
		int i=0,j=0,k=0;
        int res=Integer.MAX_VALUE;
        String ans="";
        while(j<str1.length() && k<str2.length())
        {
        	if(str1.charAt(j)==str2.charAt(k))
        		k++;
        	if(k==str2.length())
        	{
        		i=j;
        		k=str2.length()-1;
        		while(i>=0 && k>=0)
        		{
        			if(str2.charAt(k)==str1.charAt(i))
        				k--;
        			i--;
        		}
        		i++;
        		if(res>j-i+1)
        		{
        			res=j-i+1;
        			ans=str1.substring(i,j+1);
        		}
        		k=0;j=i+1;
        	}
        	j++;
        }
        return ans;
    }
	public static void main(String[] args) 
	{
		System.out.println(minWindow("rdew","u"));//""
		System.out.println(minWindow("abcdebdde","bde"));//bcde
		System.out.println(minWindow("hello","eo"));//ello
		System.out.println(minWindow("goodbye","dy"));//dby
	}
}