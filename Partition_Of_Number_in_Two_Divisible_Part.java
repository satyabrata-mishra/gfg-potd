package cp;

public class Partition_Of_Number_in_Two_Divisible_Part
{
	public static String stringPartition(String S, int a, int b)
	{
		if(S.length() == 1)
            return "-1";
        int left=0,right=0;
        for(int i=0;i<S.length()-1;i++)
        {
            String A=(S.substring(0,i+1));
            String B=(S.substring(i+1,S.length()));
            System.out.println(A+" "+B);
            left=Integer.parseInt(A);
            right=Integer.parseInt(B);
            if(left%a==0 && right%b==0)
            return (A+" "+B);
        }
        return "-1";
    }
	public static void main(String[] args) 
	{
		String s="125";
		int a=12;
		int b=5;
		System.out.println(stringPartition(s,a,b));
	}

}
