package cp;
import java.util.*;
public class Permutation_Using_Backtracking 
{
	public static ArrayList<Integer> swap(ArrayList<Integer> a,int i,int j)
	{
		Collections.swap(a, i, j);
		return a;
	}
	public static void permute(ArrayList<Integer> a,int i,int j)
	{
		if(i==j)
			System.out.println(a);
		for(int k=i;k<=j;k++)
		{
			a = swap(a,k,i);
			permute(a,i+1,j);
			a = swap(a,k,i);
		}
	}
	public static void main(String[] args) 
	{
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		permute(a,0,a.size()-1);
	}

}
