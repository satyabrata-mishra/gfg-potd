package cp;
import java.util.*;
public class Valid_Paranthesis 
{
	public static boolean isValidParenthesis(String expr)
    {
		Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < expr.length(); i++)
        {
            char x = expr.charAt(i);
            if (x == '(' || x == '[' || x == '{')
            {
                stack.push(x);
                continue;
            }
            if(stack.isEmpty())
            	return false;
            if(x==')')
            {
            	char temp=stack.pop();
            	if(temp=='}' || temp==']')
            		return false;
            	break;
            }
            else if(x=='}')
            {
            	char temp=stack.pop();
            	if(temp==')' || temp==']')
            		return false;
            	break;
            }
            else if(x==']')
            {
            	char temp=stack.pop();
            	if(temp=='}' || temp==')')
            		return false;
            	break;
            }
        }
    return (stack.isEmpty());
    }
	public static void main(String[] args) 
	{
		System.out.println(isValidParenthesis("(){"));
		System.out.println(isValidParenthesis("(){}[]"));
		System.out.println(isValidParenthesis("([)]"));
	}

}
