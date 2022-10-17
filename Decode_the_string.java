package cp;
import java.util.*;
public class Decode_the_string 
{
	static String decodedString(String s)
    {
		Stack<Character> st = new Stack<>();
        int n = s.length();
        StringBuilder res = new StringBuilder("");
        for(int i = 0; i < n; i++)
        {
            char c = s.charAt(i);
            if(c!=']')
                st.push(c);
            else
            {
            	while(st.peek()!='[')
                    res.append(st.pop());
                res.reverse();
                st.pop();
                StringBuilder rnum = new StringBuilder("");
                while(!st.empty() && st.peek() >= '0' && st.peek() <= '9')
                    rnum.append(st.pop());
                rnum.reverse();
                String sr = res.toString();
                for(int k = 0; k < Integer.parseInt(rnum.toString())-1; k++)
                    res.append(sr);
                for(int k = 0; k < res.length(); k++)
                    st.push(res.charAt(k));
                res = new StringBuilder("");
            }
        }
        res = new StringBuilder("");
        while(!st.empty())
            res.append(st.pop());
        return res.reverse().toString();
    }
	public static void main(String[] args) 
	{
		System.out.println(decodedString("3[b2[ca]]"));
	}
}