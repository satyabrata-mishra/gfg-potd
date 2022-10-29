package cp;
import java.util.*;
public class Stepping_Numbers 
{
	public static int steppingNumbers(int n, int m)
    {
		Queue<Integer> q = new ArrayDeque<>();
        int cnt = 0;
        for(int i = 1;i<10;i++)
            q.offer(i);
        if(n==0) 
        	cnt++;
        while(!q.isEmpty())
        {
            int node = q.poll();
            if(node>=n && node<=m)
                cnt++;
            int child,lastdigit = node%10;
            node*=10;
            if(lastdigit!=0)
            {
                child = node+lastdigit-1;
                if(child<=m) 
                	q.offer(child);
            }
            if(lastdigit!=9)
            {
                child = node+lastdigit+1;
                if(child<=m) 
                	q.offer(child);
            }
        }
        return cnt;
    }
	public static void main(String[] args) 
	{
		System.out.println(steppingNumbers(10,15));
	}

}