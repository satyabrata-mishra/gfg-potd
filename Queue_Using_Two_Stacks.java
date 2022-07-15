package cp;
import java.util.*;
public class Queue_Using_Two_Stacks
{
    public static Stack<Integer> s1 = new Stack<Integer>();
    public static Stack<Integer> s2 = new Stack<Integer>();
    public static void Push(int x)
    {
	    s1.push(x);
    }
    public static int Pop()
    {
    	if(s1.isEmpty())
            return -1;
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int ans=s2.pop();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return ans;
    }
	public static void main(String[] args)
	{
		
	}

}
