package cp;
import java.util.*;
public class Pascal_Triangle 
{
	public static ArrayList<Long> nthRowOfPascalTriangle(int n)
    {
		long mod=1000000007L;
		ArrayList<ArrayList<Long>> list = new ArrayList<ArrayList<Long>>();
		list.add(new ArrayList<>(Arrays.asList(1L)));
		for(int i=1;i<n;i++)
		{
			ArrayList<Long> append_list=new ArrayList<Long>();
			ArrayList<Long> cur_lis=list.get(i-1);
			append_list.add(cur_lis.get(0));
			for(int j=0;j<cur_lis.size()-1;j++)
				append_list.add((cur_lis.get(j)+cur_lis.get(j+1))%mod);
			append_list.add(cur_lis.get(cur_lis.size()-1));
			list.add(append_list);
		}
		return list.get(n-1);
    }
	public static void main(String[] args) 
	{
		System.out.println(nthRowOfPascalTriangle(4));//1 3 3 1
		System.out.println(nthRowOfPascalTriangle(5));//1 4 6 4 1
	}
}