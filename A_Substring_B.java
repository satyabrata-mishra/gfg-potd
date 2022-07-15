package cp;
public class A_Substring_B 
{
    public static int minRepeats(String A, String B)
    {
    	int count=1;
    	String str=A;
        while(true)
        {
            if(A.contains(B))
                break;
            else
            {
                ++count;
                if(count==999)
                	return -1;
                A+=str;
            }
        }
        return count;
    }
	public static void main(String[] args)
	{
		System.out.println(minRepeats("ab","cab"));
	}

}
