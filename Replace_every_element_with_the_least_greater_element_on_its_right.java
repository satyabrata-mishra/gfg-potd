package cp;
import java.util.*;
public class Replace_every_element_with_the_least_greater_element_on_its_right
{
	public static ArrayList<Integer> findLeastGreater(int n, int[] arr) 
    {
		ArrayList<Integer> ans = new ArrayList<>();
        TreeSet<Integer> s = new TreeSet<>();
        for(int i=n-1;i>=0;i--)
        {
          s.add(arr[i]);
          if(s.higher(arr[i]) == null)
        	  ans.add(-1);
          else
        	  ans.add(s.higher(arr[i]));
        }
        Collections.reverse(ans);
        return ans;
    }
	public static void main(String[] args) 
	{
		int a[] = {8, 58, 71, 18, 31, 32, 63, 92, 43, 3, 91, 93, 25, 80, 28};
		System.out.println(findLeastGreater(a.length,a));
	}

}
