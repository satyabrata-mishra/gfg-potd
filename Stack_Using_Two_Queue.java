package cp;
import java.util.*;
public class Stack_Using_Two_Queue
{
	public static Queue<Integer> q1 = new LinkedList<Integer>();;
	public static Queue<Integer> q2 = new LinkedList<Integer>();;
	public static void push(int x)
	{
		if(!q1.isEmpty())
		{
			q2.offer(q1.poll());
		}
		q1.offer(x);
		if(!q2.isEmpty())
		{
			q1.offer(q2.poll());
		}
	}
	public static int pop()
	{
		if(q1.isEmpty())
			return -1;
		return q1.poll();
	}
	public static void main(String[] args)
	{
		push(1);
		push(2);
		push(3);
		push(4);
		System.out.println(pop());
	}

}
