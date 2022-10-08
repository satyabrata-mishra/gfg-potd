package cp;
import java.util.*;
public class Sorting_A_Stack 
{
	public static void helper(Stack<Integer> s ,int num)
	{
		if(s.isEmpty()||s.peek()<num)
		{
			s.add(num);
			return;
	     }
	     int n=s.pop();
	     helper(s,num);
	     s.add(n);
	 }
	public static Stack<Integer> sort(Stack<Integer> s)
	{
		if(s.isEmpty())
			return s;
		int num=s.pop();
		sort(s);
		helper(s,num);
		return s;
	}
	public static void main(String[] args) 
	{
		Stack<Integer> s = new Stack<Integer>();
		s.push(11);
		s.push(2);
		s.push(32);
		s.push(3);
		s.push(41);
		s.push(-1);
		s=sort(s);
		System.out.println(s);
	}

}
