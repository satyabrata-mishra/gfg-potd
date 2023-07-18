package cp;
import java.util.*;
public class Queue_Reverse 
{
	public static Queue<Integer> rev(Queue<Integer> q)
    {
        Stack<Integer> s = new Stack<Integer>();
        while(!q.isEmpty())
        	s.add(q.poll());
        Queue<Integer> ans = new LinkedList<Integer>();
        while(!s.isEmpty())
        	ans.add(s.pop());
        return ans;
    }
	public static void main(String[] args) 
	{
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(4);
		q.add(3);
		q.add(1);
		q.add(10);
		q.add(2);
		q.add(6);
		System.out.println(rev(q));
	}

}
