package cp;
import java.util.*;
public class Queries_On_String
{
	public static  int[] SolveQueris(String str, int[][] Query)
    {
		HashSet<Character> stringSet=new HashSet<Character>();
        int a[]=new int[Query.length];
        for(int i=0;i<Query.length;i++)
        {
        	stringSet.clear();
        	String temp=str.substring(Query[i][0]-1,Query[i][1]);
        	for(int j=0;j<temp.length();j++)
        		stringSet.add(temp.charAt(j));
        	a[i]=stringSet.size();
        	
        }
        return a;
    }
	public static void main(String[] args)
	{
		int a[][]= {{1,4},{2,4},{1,7}};
		String str="abcbaed";
		int s[]=SolveQueris(str,a);
		for(int i:s)
			System.out.print(i+" ");
	}

}
