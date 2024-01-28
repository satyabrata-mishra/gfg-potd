package cp;
import java.util.*;
public class Remove_K_Digits 
{
	public static String removeKdigits(String S, int K)
	{
        Stack<Character> st = new Stack<>();
        for(char i:S.toCharArray())
        {
            while(K!=0 && !st.isEmpty() && i<st.peek())
            {
                K--;
                st.pop();
            }
            if(st.isEmpty() && i == '0')//Condition to handle leading zeros
                continue;
            st.push(i);
        }
        while(!st.isEmpty() && K-- != 0)
            st.pop();
        if(st.size()==0)  //EMPTY STRING
            return "0";
        StringBuilder sb=new StringBuilder();
        for(char c:st)
            sb.append(c);
        return sb.toString();
	}
	public static void main(String[] args) 
	{
		String S = "149811";
		int K = 3;
		System.out.println(removeKdigits(S,K)); //111
		S = "10000005";
		K = 5;
		System.out.println(removeKdigits(S,K)); //0
	}
}