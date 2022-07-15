package cp;

public class String_Formation_From_Substring
{
	public static int isRepeat(String s)
	{
		for (int j = 1; j <= s.length() / 2; j++)
        {
            if (s.length() % j != 0)   
            	continue;
            String comp = s.substring(0, j);
            System.out.println(comp);
            int i = j;
            while (i <= s.length() - j)
                if (comp.equals(s.substring(i, j+i)))
                	i += j;
                else
                	break;
            if (i > s.length() - j)   
            	return 1;
        }
        return 0;
	}
	public static void main(String[] args)
	{
		System.out.println(isRepeat("abababc"));
	}

}
