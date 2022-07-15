package cp;
import java.util.*;
public class Transform_String 
{
	public static int transform(String A , String B)
	{
		char ch1[]=A.toCharArray();
        char ch2[]=B.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if (!Arrays.equals(ch1,ch2))
            return -1;
        int i=A.length()-1,j=B.length()-1,res=0;
        while (i>=0)
        {
            if(A.charAt(i)!=B.charAt(j))
                res++;
            else
                --j;
            --i;
        }
        return res;
	}
	public static void main(String[] args) 
	{
		String str1="abd";
		String str2="bad";
		System.out.println(transform(str1,str2));
	}

}
