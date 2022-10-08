package cp;

public class Longest_Common_Prefix 
{
	public static String common(String s1,String s2)
	{
		String res = "";
		for(int i=0,j=0;i<s1.length()&& j<s2.length();i++,j++)
		{
			if(s1.charAt(i)!=s2.charAt(j))
				return res;
			res+=s1.charAt(i);
		}
		if(res.isBlank())
			return "-1";
		return res;
	}
	public static String longestCommonPrefix(String arr[], int n)
    {
		String result=arr[0];
		for(int i=1;i<n;i++)
			result=common(result,arr[i]);
		if(result.length()==0)
			return "-1";
		return result;
    }
	public static void main(String[] args) 
	{
		String arr[] = {"hello", "world"};
		System.out.println(longestCommonPrefix(arr,arr.length));
	}

}
