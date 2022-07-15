package cp;public class Longest_Common_Prefix
{
	public static String commonPrefix(String str1, String str2)
	{
		String result="";
		for(int i=0, j=0;i<str1.length() && j<str2.length();i++,j++)
			if(str1.charAt(i)==str2.charAt(j))
				result+=str1.charAt(i);
		return result;
	}
	public static String lcp(String s[],int n)
    {
		String result=s[0];
		for(int i=1;i<n;i++)
			result=commonPrefix(result,s[i]);
		if(result.equals(""))
		    return "-1";
		return result;
    }
	public static void main(String[] args)
	{
		String str[]= {"abc", "abcd", "abcde", "abcdef"};
		System.out.println(lcp(str,str.length));
	}

}
