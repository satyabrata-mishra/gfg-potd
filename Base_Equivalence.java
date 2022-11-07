package cp;
public class Base_Equivalence 
{
	public static String baseEquiv(int n, int m)
    {
        for(int i=2;i<=32;i++)
        {
            int temp=n,c=0;
            while(temp>0)
            {
                c++;
                if(c>m)
                    break;
                temp/=i;
            }
            if(c==m)
            	return "Yes";
        }
        return "No";
    }
	public static void main(String[] args) 
	{
		System.out.println(baseEquiv(16,1));
	}

}
