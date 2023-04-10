package cp;
public class Minimum_Steps_Required
{
	public static int minSteps(String str) 
	{
		int cnt=1;
        for(int i=0;i<str.length()-1;i++)
            if(str.charAt(i)!=str.charAt(i+1))
                cnt++;
        return cnt/2 + 1;
	}
	public static void main(String[] args) 
	{
		System.out.println(minSteps("bbaaabb"));
	}
}