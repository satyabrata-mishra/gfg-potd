package cp;
import java.util.Stack;
public class Lexicographically_smallest_string
{
	static String lexicographicallySmallest(String S, int k) 
    {
		int n = S.length();
		k = n!= 0 && (n&(n-1)) == 0 ? k/2 : k*2;
		Stack<Character> st = new Stack<>();
        for(int i = 0; i < S.length(); i++)
        {
        	char ch = S.charAt(i);
        	while(!st.isEmpty() && ch < st.peek() && k > 0)
        	{
        		st.pop();
        		k--;
            }
            st.push(ch);
        }
        while(k > 0 && !st.isEmpty())
        {
            st.pop();
            k--;
        }
        if(!st.isEmpty())
        {
            StringBuilder sb = new StringBuilder();
            while(!st.isEmpty())
            	sb.append(st.pop());
            return sb.reverse().toString();
        }
        return "-1";
    }
	public static void main(String[] args)
	{
		System.out.println(lexicographicallySmallest("fooland",2));
		System.out.println(lexicographicallySmallest("code",4));
	}

}
