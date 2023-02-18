package cp;
import java.util.*;
public class Is_it_Fibonacci 
{
	public static long solve(int N, int K, ArrayList<Long> GeekNum) //O(n^2)
    {
		while(GeekNum.size()!=N)
		{
			long sum = 0;
			int index = GeekNum.size()-1;
			for(int i=0;i<K;i++)
				sum+=GeekNum.get(index--);
			GeekNum.add(sum);
		}
		System.out.println(GeekNum);
		return GeekNum.get(N-1);
    }
	public static long solve1(int N, int K, ArrayList<Long> GeekNum) //O(n)
    {
		long sum = 0;
        for(long l: GeekNum) 
        	sum += l;
        for(int curr=K; curr<N; curr++)  
        {
        	GeekNum.add(sum);
            sum = sum + GeekNum.get(curr) - GeekNum.get(curr-K);
        }
        return GeekNum.get(N-1);
    }
	public static void main(String[] args) 
	{
		ArrayList<Long> geek = new ArrayList<Long>();
		geek.add(0l);
		geek.add(1l);
		geek.add(2l);
		System.out.println(solve1(5,3,geek));
	}

}
