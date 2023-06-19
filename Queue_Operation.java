package cp;
import java.util.*;
public class Queue_Operation 
{
	static void insert(Queue<Integer> q, int k)
	{
		q.add(k);
    }
    static int findFrequency(Queue<Integer> q, int k)
    {
    	int count = 0;
    	for(int i:q)
    		if(i==k)
    			count++;
    	if(count==0)
    		return -1;
    	return count;
    }
	public static void main(String[] args) 
	{
		int insert[]= {1, 2, 3, 4, 5, 2, 3, 1};
		int count[]= {1, 3, 2, 9, 10};
		Queue<Integer> q = new LinkedList<Integer>();
		for(int i:insert)
			insert(q,i);
		for(int i:count)
			System.out.print(findFrequency(q, i)+" ");
	}
}