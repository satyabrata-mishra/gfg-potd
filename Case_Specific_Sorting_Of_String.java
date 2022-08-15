package cp;
import java.util.*;
public class Case_Specific_Sorting_Of_String 
{
	public static String caseSort(String str)
    {
		StringBuilder scase=new StringBuilder();
        StringBuilder ucase=new StringBuilder();
        char[] arr=str.toCharArray();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            char c=arr[i];
            if(c>='a' && c<='z')
                scase.append(c);
            else
                ucase.append(c);
        }
        char[] lower=scase.toString().toCharArray();
        char[] upper=ucase.toString().toCharArray();
        int l=0,u=0;
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(c>='a' && c<='z')
                ans.append(lower[l++]);
            else
                ans.append(upper[u++]);
        }
        return ans.toString();
    }
	public static void main(String[] args) 
	{
		System.out.println(caseSort("defRTSersUXI"));
		System.out.println(caseSort("srbDKi"));
	}

}
