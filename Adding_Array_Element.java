package cp;
import java.util.*;
public class Adding_Array_Element 
{
	public static int minOperations(int[] arr, int n, int k) 
    {
		int counter=0;
	       Queue<Integer> pq=new PriorityQueue<>();
	       for(int i:arr)
	           pq.add(i);//adding all the elements in priority queue
	       int a=pq.remove();
	       int b=pq.remove();
	       while(a<k || b<k)
	       { 
	           int c=a+b;
	           pq.add(c);
	           if(pq.size()>2)
	           {
	        	a=pq.remove();
	            b=pq.remove();
	            counter+=1;
	           } 
	       }
	       return counter;
    }
	public static void main(String[] args) 
	{
		int a[] = {1, 10, 12, 9, 2, 3};
		int n = a.length, k = 4; 
		System.out.println(minOperations(a,n,k));
	}

}
