package cp;
import java.util.*;
public class Minimum_Cost_to_cut_a_board_into_squares 
{
	public static int minimumCostOfBreaking(int[] X, int[] Y,int M,int N) 
    {
		int sum=0;
		Arrays.sort(X);
		Arrays.sort(Y);
		int i=M-1,j=N-1;
		int cuth=1,cutv=1;
		while(i>=0 && j>=0)
			if(X[i]>=Y[j])
			{
				sum+=X[i] * cutv;
				i--; cuth++;
			}
			else
			{
				sum+=Y[j]*cuth;
				j--; cutv++;
			}
		if(i>=0)
			while(i>=0)
				sum+=X[i--] * cutv;
		if(j>=0)
			while(j>=0)
				sum+=Y[j--] * cuth;
		return sum;
    }
	public static void main(String[] args)
	{
		int x[] = {2, 1, 3, 1, 4};
		int y[] = {4, 1, 2};
		System.out.println(minimumCostOfBreaking(x,y,x.length,y.length));
	}

}
