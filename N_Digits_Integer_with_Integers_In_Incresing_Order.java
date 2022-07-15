package trial;
import java.util.*;
public class N_Digits_Integer_with_Integers_In_Incresing_Order
{
	public static boolean uniqueCharacters(String str)
    {
        for (int i = 0; i < str.length(); i++)
            for (int j = i + 1; j < str.length(); j++)
                if (str.charAt(i) == str.charAt(j))
                    return false;
        return true;
    }
	public static ArrayList<Integer> increasingNumbers(int N)
	{
		ArrayList<Integer> a=new ArrayList<Integer>();
		String n="";
		for (int i=0;i<N;i++)
			n=n+"9";
		for (int i=0;i<=Integer.parseInt(n);i++)
		{
			String str=Integer.toString(i);
			if(str.length()==N)
			{
				if(uniqueCharacters(str)==true)
				{
					char ch[]=str.toCharArray();
					Arrays.sort(ch);
					String sortstr=new String (ch);
					if(str.equals(sortstr))
						a.add(Integer.parseInt(sortstr));
				}
			}
		}	
	return a;
	}
	public static void main(String[] args)
	{
		System.out.println(increasingNumbers(2));
	}

}
