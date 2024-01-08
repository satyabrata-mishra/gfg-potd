 package cp;
import java.util.*;
public class Check_if_a_string_is_repetition_of_its_substring_of_k_length 
{
	public static int kSubstrConcat(int n, String s, int k)
    {
		if(n%k!=0)
			return 0;
		HashMap<String,Integer> map=new HashMap<String, Integer>();
		for(int i=0;i+k<=n;i+=k)
		{
			String temp=s.substring(i,i+k);
			map.put(temp,map.getOrDefault(temp,0)+1);
		}
		return map.size()<=2?1:0;
    }
	public static void main(String[] args) 
	{
		int K = 2;
		String S = "abcd";
		System.out.println(kSubstrConcat(S.length(), S, K));
	}
}