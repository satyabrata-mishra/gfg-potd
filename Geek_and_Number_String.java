package cp;
import java.util.*;
public class Geek_and_Number_String 
{
	public static int minLength(String s, int n) 
    { 
		ArrayList<String> al=new ArrayList<>();
    	al.addAll(Arrays.asList("12","21","34","43","56","65","78","87","09","90"));
    	int i=0;
    	if(n==1)
    	    return n;
    	Stack<Character> st=new Stack<>();
    	while(i<n)
    	{
    	    st.push(s.charAt(i));
    	    if(st.size()>=2)
    	    {
    	        char c1=st.peek();
    	        st.pop();
    	        char c2=st.peek();
    	        st.pop();
    	        String temp=""+c1+c2;
    	        if(al.contains(temp)==false)
    	        {
    	            st.push(c2);
    	            st.push(c1);
    	        }
    	    }
    	    i++;
    	}
    	return st.size();
    }
	public static void main(String[] args) 
	{
		String S = "906550994";
		System.out.println(minLength(S,S.length()));
	}

}
