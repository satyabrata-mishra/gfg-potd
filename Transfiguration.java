package cp;
import java.util.*;
public class Transfiguration
{
	public static int transfigure (String A, String B)
    {
        char a[] = A.toCharArray();
    	char b[] = B.toCharArray();
    	Arrays.sort(a);
    	Arrays.sort(b);
    	if(!Arrays.equals(a,b)){
    	    return -1;
    	}
    	
    	int i = A.length()-1;
    	int j = B.length()-1;
    	int res= 0;
    	
    	while(i>=0 && j>=0){
    	    if(A.charAt(i) == B.charAt(j)){
    	        i--;j--;
    	    }else{
    	        res++;
    	        i--;
    	    }
    	}
    	return res;
    }
	public static void main(String[] args)
	{
		System.out.println(transfigure("GEEKSFORGEEKS","FORGEEKSGEEKS"));
	}

}
