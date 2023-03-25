package cp;
import java.util.*;
public class Nth_No_Made_Up_Of_Prime_Digits
{
	public static int primeDigits(int n)
    {
		Queue<String> q = new LinkedList<String>();
		q.add("2");
		q.add("3");
		q.add("5");
		q.add("7");
		String ans="";
		for(int i=0;i<n;i++)
		{
			ans=q.poll();
			q.add(ans+"2");
			q.add(ans+"3");
			q.add(ans+"5");
			q.add(ans+"7");
		}
		return Integer.parseInt(ans);
    }
	public static void main(String[] args)
	{
		System.out.println(primeDigits(10));
	}

}
