package cp;
import java.util.*;

public class Unequal_Arrays 
{
	public static long solve(int N, int[] A, int[] B) 
    {
		Arrays.sort(A);
		Arrays.sort(B);
		ArrayList<Integer> Aodds = new ArrayList<>();
		ArrayList<Integer> Aevens = new ArrayList<>();
		ArrayList<Integer> Bodds = new ArrayList<>();
		ArrayList<Integer> Bevens= new ArrayList<>();
		long sum1=0,sum2=0;
		for(int i=0;i<N;i++)
		{
			sum1+=A[i];
			sum2+=B[i];
			if(A[i]%2==0)
				Aevens.add(A[i]);
			else
				Aodds.add(A[i]);
			if(B[i]%2==0)
				Bevens.add(B[i]);
			else
				Bodds.add(B[i]);
		}
		if(sum1!=sum2 || Aevens.size()!=Bevens.size() || Aodds.size()!=Bodds.size())
			return -1;
		long ans = 0;
		for(int i=0;i<Aodds.size();i++)
			ans+=Math.abs(Aodds.get(i)-Bodds.get(i));
		for(int i=0;i<Aevens.size();i++)
			ans+=Math.abs(Aevens.get(i)-Bevens.get(i));
		return ans/4;
    }
	public static void main(String[] args) 
	{
		int A[] = {2, 5, 6};
		int B[] = {1, 2, 10};
		System.out.println(solve(A.length,A,B));
	}

}
