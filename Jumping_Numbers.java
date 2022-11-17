package cp;
import java.util.*;
public class Jumping_Numbers 
{
	public static long jumpingNums(long X) 
    {
		Queue<Long> queue = new LinkedList<>();
        for(long i = 1; i<=9; i++) 
            queue.add(i);
        long ans = 0;
        while(!queue.isEmpty()) 
        {
            long num = queue.remove();
            if(num > X) 
                continue;
            ans = Math.max(ans, num);
            long lastDigit = num % 10;
            if(lastDigit != 0)
            {
                long f = num * 10 + (lastDigit-1);
                queue.add(f);
            }
            if(lastDigit != 9) 
            {
                long s = num * 10 + (lastDigit+1);
                queue.add(s);
            }
            System.out.print(ans+" ");
        }
        return ans;
    }
	public static void main(String[] args) 
	{
		System.out.println(jumpingNums(50));
	}

}
