package cp;
import java.util.*;
public class Reaching_The_Heights 
{
	public static ArrayList<Integer> reaching_height (int n, int arr[])
	{
        ArrayList<Integer> al = new ArrayList<Integer>();
        Arrays.sort(arr);
        if(arr[0]==arr[n-1] && n>1)
        {
        	al.add(-1);
        	return al;
        }
        int i=0, j=n-1;
        for(int x=0;x<n;x++)
        {
        	if(x%2==0)
        		al.add(arr[j--]);
        	else
        		al.add(arr[i++]);
        }
        return al;
    }
    
	public static void main(String[] args) 
	{
		int a[]= {2, 3, 4, 5};
		System.out.println(reaching_height(a.length,a));
	}

}
