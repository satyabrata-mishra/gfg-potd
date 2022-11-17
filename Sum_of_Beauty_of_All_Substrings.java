package cp;
public class Sum_of_Beauty_of_All_Substrings 
{
	public static int beautySum(String s) 
    {
		int sum=0;
        for (int i=0;i<s.length();i++) 
        { 
            int most=0,least,n;
            char arr[]=new char[128];
            for (int j=i;j<s.length();j++) 
            { 
                arr[s.charAt(j)]++;
                n=arr[s.charAt(j)];
                if (n>most) 
                    most=n;
                least=10000;
                for (int k=97;k<=122;k++)
                    if (arr[k]>0 && arr[k]<least) 
                        least=arr[k];
                sum+=most-least;
            }
        }
        return sum;
    }
	public static void main(String[] args)
	{
		System.out.println(beautySum("fsksrsrt")); //output-23
//		System.out.println(beautySum("geeksforgeeks"));
	}

}
