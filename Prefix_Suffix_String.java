package cp;

public class Prefix_Suffix_String 
{
	public static int prefixSuffixString(String s1[],String s2[])
    {
        int ans = 0;
        for(int i=0;i<s2.length;i++)
        {
        	for(int j=0;j<s1.length;j++)
        	{
        		if(s1[j].startsWith(s2[i]) || s1[j].endsWith(s2[i]))
        		{
        			ans++;
        			break;
        		}
        	}
        }
        return ans;
    }
	public static void main(String[] args) 
	{
		String s1[] = {"cat", "catanddog", "lion"};
		String s2[] = {"cat", "dog", "rat"};
		System.out.println(prefixSuffixString(s1,s2));
	}

}
