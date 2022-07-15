package cp;
import java.util.*;
public class Unique_Subsets
{
	public static ArrayList <ArrayList <Integer>> AllSubsets(int arr[], int n)
    {
		Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<(int)Math.pow(2, n);i++)
        {
        	ArrayList<Integer> temp =new ArrayList<Integer>();
        	String s = Integer.toBinaryString(i);
        	for(int j=0;j<s.length()%n;++j)
        		s="0"+s;
        	for(int j=0;j<s.length();j++)
        		if(s.charAt(j)=='1')
        			temp.add(arr[j]);
        	if(!a.contains(temp))
        		a.add(temp);
        }
        return a;
    }
	public static void main(String[] args) 
	{
		int arr[] = {2,1,2};
		ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
		a = AllSubsets(arr , arr.length);
		System.out.println(a);
	}

}
