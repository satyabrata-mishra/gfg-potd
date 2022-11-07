package cp;
import java.util.*;
public class Satisfy_The_Equation 
{
//	Given Approach
	public static int[] satisfyEqn1(int[] A, int N)
    {
		int ans[]= {-1,-1,-1,-1};
		HashMap<Integer,ArrayList<Integer>> mp=new HashMap<Integer, ArrayList<Integer>>();
		for(int i=0;i<N-1;i++)
			for(int j=i+1;j<N;j++)
			{
				int sum=A[i]+A[j];
				if(mp.containsKey(sum))
				{
					ArrayList<Integer> tmp = mp.get(sum);
					tmp.add(i);
					tmp.add(j);
					mp.put(sum, tmp);
				}
				else
				{
					ArrayList<Integer> tmp = new ArrayList<Integer>();
					tmp.add(i);
					tmp.add(j);
					mp.put(sum, tmp);
				}
			}
		System.out.println(mp);
		for(ArrayList<Integer> i:mp.values())
			if(i.size()>=4)
			{
				for(int j=4;j<=i.size();j+=2)
				{
					System.out.println(i.get(j-4)+" "+i.get(j-3)+" "+i.get(j-2)+" "+i.get(j-1));
				}
			}
		return ans;
    }
	
//	Naive Approach
	public static int[] satisfyEqn2(int[] A, int N)
	{
		for(int i=0;i<N;i++)
			for(int j=0;j<N;j++)
				for(int k=0;k<N;k++)
					for(int l=0;l<N;l++)
						if(i!=j && j!=k && k!=l && l!=i && i!=k && j!=l && A[i]+A[j]==A[k]+A[l])
							return new int[] {i,j,k,l};
		return new int[] {-1,-1,-1,-1};
	}
	public static void main(String[] args) 
	{
		int A[] =  {3, 4, 7, 1, 2, 9, 8};
		A=satisfyEqn2(A,A.length);
		for(int i:A)
			System.out.print(i+" ");
	}

}
