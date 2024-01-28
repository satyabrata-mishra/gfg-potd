package cp;
import java.util.*;
public class Reverse_First_K_elements_of_Queue 
{
	public static Queue<Integer> modifyQueue(Queue<Integer> q, int k) 
	{
		Stack<Integer> stack=new Stack<Integer>();
		for(int i=0;i<k;i++)
			stack.add(q.poll());
		while(!stack.isEmpty())
			q.add(stack.pop());
		for(int i=0;i<q.size()-k;i++)
			q.add(q.poll());
		return q;
    }
	public static void main(String[] args) 
	{
		Queue<Integer> q=new LinkedList<Integer>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		System.out.println(modifyQueue(q,5));
	}
}