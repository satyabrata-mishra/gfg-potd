package cp;
import java.util.*;
public class Remove_All_Duplicate_Pair_In_A_String 
{
	public static String removePair(String s) 
    {
		Stack<Character> stack = new Stack<Character>();
		int n = s.length();
		for(int i=0;i<n;i++)
		{
			char temp = s.charAt(i);
			if(!stack.isEmpty() && stack.peek()==temp)
				stack.pop();
			else
				stack.add(temp);
		}
		if(stack.isEmpty())
		    return "-1";
		StringBuilder sb = new StringBuilder();
		while(!stack.isEmpty())
			sb.append(stack.pop());
		return sb.reverse().toString();
    }
	public static void main(String[] args) 
	{
		System.out.println(removePair("aaabbaaccd"));
	}

}
