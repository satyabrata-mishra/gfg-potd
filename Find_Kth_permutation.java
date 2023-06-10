package cp;
import java.util.*;
public class Find_Kth_permutation 
{
	public static String kthPermutation(int n,int k) 
	{
		int fact = 1;
        ArrayList<Integer> numbers=new ArrayList<Integer>();
        String ans = "";
        for(int i = 1; i < n; i++)
        {
            fact*=i;
            numbers.add(i);
        }
        numbers.add(n);
        k--;
        while(true)
        {
            ans+=Integer.toString(numbers.get(k/fact));
            numbers.remove(k / fact);
            if(numbers.size() == 0)
                break;
            k = k % fact;
            fact/=numbers.size();
        }
        return ans;
	}
	public static void main(String[] args) 
	{
		System.out.println(kthPermutation(3,5));
	}
}