package cp;
import java.util.*;
public class Build_The_Smallest 
{
	public static String buildLowestNumber(String str, int N) 
    {
		Stack<Character> stack = new Stack<Character>();
		for(int i=0;i<str.length();i++)
		{
			char temp = str.charAt(i);
			while(!stack.isEmpty() && stack.peek()>temp && N!=0)
			{
				stack.pop();
				N--;
			}
			stack.push(temp);
		}
		StringBuilder ans = new StringBuilder();
		while(!stack.isEmpty())
		{
			char temp = stack.pop();
			if(N!=0)
			{
				N--;
				continue;
			}
			ans.append(temp);
		}
		ans.reverse();
		for(int i=0;i<ans.length();i++)
			if(ans.charAt(i)!='0')
				return ans.substring(i).toString();
		return "0";
    }
	public static void main(String[] args) 
	{
		String str = "143729";
		System.out.println(buildLowestNumber(str,2));
	}

}
