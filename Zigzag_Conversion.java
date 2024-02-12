//For 3 rows
//P   A   H   N
//A P L S I I G
//Y   I   R

//For 4 rows
//P     I    N
//A   L S  I G
//Y A   H R
//P     I
package cp;
public class Zigzag_Conversion 
{
	public static String convert(String s, int numRows) 
	{
		int n = s.length();
        StringBuffer [] arr = new StringBuffer[numRows]; 
        for(int i=0; i<numRows; i++) 
        	arr[i] = new StringBuffer();
        int i=0;
        while(i<n)
        {
            for(int j=0;j<numRows&&i<n;j++)
            	arr[j].append(s.charAt(i++));
            for(int j=numRows-2;j>0&&i<n;j--)
            	arr[j].append(s.charAt(i++));
        }
        StringBuffer ans = new StringBuffer();
        for(StringBuffer el : arr)
            ans.append(el);
        return ans.toString();
    }
	public static void main(String[] args) 
	{
		System.out.println(convert("PAYPALISHIRING",3));
		System.out.println(convert("PAYPALISHIRING",4));
	}
}