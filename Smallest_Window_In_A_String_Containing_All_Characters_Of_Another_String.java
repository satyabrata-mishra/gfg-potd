package cp;
public class Smallest_Window_In_A_String_Containing_All_Characters_Of_Another_String 
{
	public static String smallestWindow(String s, String p)
    {
		int n = s.length();
        int m = p.length();
        if(m>n) 
        	return "-1";
        int str[] = new int[26];
        int pat[] = new int[26];
        for(int i = 0;i<m;i++)
            pat[p.charAt(i)-'a']+=1;
        int cnt = 0,start=0,minlen = Integer.MAX_VALUE,sidx = -1;
        for(int i = 0;i<n;i++)
        {
            str[s.charAt(i)-'a']+=1;
            if(pat[s.charAt(i)-'a']!=0 && str[s.charAt(i)-'a']<=pat[s.charAt(i)-'a'])
                cnt++;
            if(cnt==m)
            {
                while(str[s.charAt(start)-'a']>pat[s.charAt(start)-'a'] || pat[s.charAt(start)-'a']==0)
                {
                    if(str[s.charAt(start)-'a']>pat[s.charAt(start)-'a'])
                    {
                        str[s.charAt(start)-'a']--;
                    }
                    start++;
                }
                int len = i-start+1;
                if(len<minlen)
                {
                    minlen = len;
                    sidx = start;
                }
            }
        }
            if(sidx == -1) return "-1";
            return 
            		s.substring(sidx,sidx+minlen);
    }
	public static void main(String[] args) 
	{
		String s = "timetopractice";
		String p = "toc";
		System.out.println(smallestWindow(s,p));
	}

}
