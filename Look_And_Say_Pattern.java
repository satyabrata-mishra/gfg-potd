package cp;
public class Look_And_Say_Pattern 
{
	public static String lookandsay(int n) 
	{
		if (n == 1)     
			return "1";
	    if (n == 2)     
	    	return "11";
	    String str = "11";
	    System.out.println("1");
	    System.out.println("11");
	    for (int i = 3; i <= n; i++)
	    {
	        str += '.';    //Just increase the length of the string by 1
	        int cnt = 1; 
	        String tmp = ""; 
	        for (int j = 0; j < str.length()-1; j++)
	        {
	            if (str.charAt(j) != str.charAt(j+1))
	            {
	                tmp += ""+cnt+str.charAt(j);
	                cnt = 1;
	            }
	            else 
	            	cnt++;
	        }
	        str = tmp;
	        System.out.println(str);
	    }
	    return str;
    }
	public static void main(String[] args) 
	{
		System.out.println("Last Value Is :"+lookandsay(4));
	}

}
