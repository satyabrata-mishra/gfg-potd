package cp;
import java.util.*;
public class Chicks_In_A_Zoo 
{
	public static long sum(ArrayList<Long> A,int n)
	{
        long s=0;
        for(int i=0;i<n;i++)
            s=s+A.get(i);
        return s;
    }
	public static long NoOfChicks(int N)
    {
		ArrayList<Long> A=new ArrayList<>();
		A.add(1l);
		for(int i=1;i<N;i++)
		{
			if(A.size()>=6)
				A.remove(0);
			A.add(2*sum(A,A.size()));
        }
        return sum(A,A.size());
    }
	public static void main(String[] args)
	{
		System.out.println(NoOfChicks(2));
	}

}
