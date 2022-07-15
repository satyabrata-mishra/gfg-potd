package cp;
import java.util.*;
public class Subset_With_XOR_Value 
{
	public static int subsetXOR(int n[], int N, int K)
	{
		int count=0;
		ArrayList<Integer> num=new ArrayList<Integer>();
		for(int i=0;i<(int)Math.pow(2, N);i++)
		{
			num.clear();
			String s = Integer.toBinaryString(i);
			for(int j=0;j<s.length()%N;j++)
				s="0"+s;
			for(int j=0;j<s.length();j++)
				if(s.charAt(j)=='1')
					num.add(n[j]);
			int xor=0;
			for(int j:num)
				xor=xor^j;
			if(xor==K)
				++count;
		}
		return count;
	}
	public static void main(String[] args)
	{
		int n[]= {1, 2, 3, 4, 5};
		int k=4;
		System.out.println(subsetXOR(n,n.length,k));
	}

}
