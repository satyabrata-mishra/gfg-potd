package cp;
import java.util.*;
public class Number_following_a_pattern 
{
	public static String printMinNumberForPattern(String S)
    {
		Stack<Integer> st=new Stack<Integer>();
        String ans="";
        int n=S.length(),ind=1;
        for(int i=0; i<n; i++)
        {
            st.push(ind);
            ind++;
            if(S.charAt(i)=='I')
            {
                while(!st.empty())
                {
                    int top=st.pop();
                    ans+=""+top;
                }
            }
        }
        st.push(ind);
        while(!st.empty())
        {
        	int top=st.pop();
        	ans+=""+top;
        }
        return ans;
    }
	public static void main(String[] args) 
	{
		String s ="D";
		System.out.println(printMinNumberForPattern(s));
		s ="IIDDD";
		System.out.println(printMinNumberForPattern(s));
	}
}