package cp;
public class Column_name_from_a_given_column_number
{
	public static String colName(long n)
    {
		String ans="";
		while(n>0)
		{
			long rem=n%26;
			if(rem==0)
			{
				ans='Z'+ans;
				n=(n/26)-1;
			}
			else
			{
				ans=(char)(rem-1+'A')+ans;
				n/=26;
			}
		}
		return ans;
    }
	public static void main(String[] args) 
	{
		System.out.println(colName(28)); //AB
		System.out.println(colName(13)); //M
		System.out.println(colName(520)); //SZ
	}
}