package cp;
import java.util.*;
public class Largest_Number_Formed_From_An_Array 
{
	public static String printLargest(String[] arr) 
    {
		Arrays.sort(arr,new Comparator<String>() {
			public int compare(String a, String b)
			{
				String s1=a+b;
				String s2=b+a;
				return s2.compareTo(s1);
			}
		});
		String ans="";
		for(String i:arr)
		{
			ans+=i;
			System.out.print(i+" ");
		}
		return ans;
    }
	public static void main(String[] args) 
	{
		String arr[] = {"3", "30", "34", "5", "9"};
		System.out.println("\n"+printLargest(arr));
	}

}
