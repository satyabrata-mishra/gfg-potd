package cp;

public class Removing_Leading_Zeros_From_An_IP_Address
{
	public static String newIPAdd(String S)
	{
		String str[]=S.split("\\.");
        for (int i=0;i<str.length;i++)
        {
            String strPattern = "^0+(?!$)";
            str[i] = str[i].replaceAll(strPattern, "");
        }
        String x="";
        for (int i=0;i<str.length-1;i++)
            x+=str[i]+".";
        x+=str[str.length-1];
        return x;
	}
	public static void main(String[] args) 
	{
		System.out.print(newIPAdd("100.020.003.400"));
	}

}
