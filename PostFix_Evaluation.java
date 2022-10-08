package cp;
import java.util.*;
public class PostFix_Evaluation 
{
	public static int evaluatePostFix(String S)
    {
		Stack<Integer> s = new Stack<Integer>();
		for(int i=0;i<S.length();i++)
		{
			char temp = S.charAt(i);
			if(Character.isDigit(temp))
				s.push(Character.getNumericValue(temp));
			else
			{ 
				int ch1=s.pop();
				int ch2=s.pop();
				if(temp=='+')
					s.push(ch2+ch1);
				else if(temp=='-')
					s.push(ch2-ch1);
				else if(temp=='*')
					s.push(ch2*ch1);
				else if(temp=='/')
					s.push(ch2/ch1);	
			}
		}
		return s.pop();
    }
	public static void main(String[] args) 
	{
		System.out.println(evaluatePostFix("123+*8-"));
	}

}
