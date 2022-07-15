package cp;
import java.util.*;
public class Maximize_An_Array 
{
	public static ArrayList<Integer> maximizeArray(int[] arr1, int[] arr2, int n) 
    {
		   TreeSet<Integer> s=new TreeSet<>();
	       for(int x: arr1)
	           s.add(x); 
	       for(int x: arr2)
	           s.add(x); 
	       System.out.println(s);
	       while(s.size()>n)
	           s.remove(s.first());
	       System.out.println(s);
	       ArrayList<Integer> al1=new ArrayList<>();
	       for(int i=0;i<n;i++)
	           if(s.contains(arr2[i]) && !(al1.contains(arr2[i])))
	               al1.add(arr2[i]);
	       for(int i=0;i<n;i++)
	           if(s.contains(arr1[i]) && !(al1.contains(arr1[i])))
	               al1.add(arr1[i]);
	       return al1;
    }
	public static void main(String[] args) 
	{
		int arr1[]= {6, 7, 5, 3};
		int arr2[]= {5, 6, 2, 9};
		ArrayList<Integer> a = new ArrayList<Integer>();
		a=maximizeArray(arr1, arr2 , arr1.length);
		for(int i:a)
			System.out.print(i+" ");
	}

}
