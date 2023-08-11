package cp;
import java.util.*;
public class Revesing_A_Stack_Using_Recursion 
{
	static void insert_at_bottom(Stack<Integer> s, int x)
	{
        if(s.size()==0)
            s.add(x);
        else
        {
            int y=s.pop();
            insert_at_bottom(s, x);
            s.add(y);
        }
    }
    static void fun(Stack<Integer> s)
    {
        if(s.size()==0)
        	return;
        int x=s.pop();
        fun(s);
        insert_at_bottom(s, x);
    }
    static void reverse(Stack<Integer> s)
    {
        fun(s);
    }
	public static void main(String[] args) 
	{
		Stack<Integer> s = new Stack<Integer>();
		s.add(3);
		s.add(2);
		s.add(1);
		s.add(7);
		s.add(6);
		reverse(s);
		System.out.println(s);
	}
}