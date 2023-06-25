package cp;
public class Prefix_match_with_other_strings 
{
	public static int klengthpref(String[] arr, int n, int k, String str)
    {
		if(k>str.length())
            return 0;
        int count = 0;
		for(String i:arr)
		{
			if(k<=i.length() && i.substring(0,k).equals(str.substring(0,k)))
				count++;
		}
		return count;
    }
	public static void main(String[] args) 
	{
		String arr[] = {"abba","abbb", "abbc", "abbd", "abaa", "abca"};
		String str = "abbg";
		int k =3;
		System.out.println(klengthpref(arr,arr.length,k,str));
	}
}