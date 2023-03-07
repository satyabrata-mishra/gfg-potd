package cp;
public class Valid_Compressed_String 
{
	static int checkCompressed(String S, String T) 
    {
        String num = "";
        int j = 0;
        for(int i=0;i<T.length();i++)
        {
            if(Character.isDigit(T.charAt(i)))
                num+=T.charAt(i);
            else
            {
                if(!num.isEmpty())
                {
                    j+=Integer.parseInt(num);
                    num="";
                }
                if(T.charAt(i)!=S.charAt(j))
                    return 0;
                else
                    j++;
            }
        }
        if(!num.isEmpty())
            j+=Integer.parseInt(num);
        if(j!=S.length())
            return 0;
        return 1;
    }
	public static void main(String[] args) 
	{
		System.out.println(checkCompressed("GEEKSFORGEEKS","G7G3S"));
	}

}
