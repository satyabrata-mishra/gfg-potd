package cp;
public class Count_Binary_Strings_With_No_Consecutive_1s 
{
	static int modulus = 1000000007;
	public static int countStrings(long N) 
	{
		++N;
		int a[][]= {{1,1},{1,0}},result[][] ={{1, 0}, {0, 1}}; 
		while (N > 0) 
		{
			if (N % 2 == 1) 
				result = multiplyMatrices(result, a);   
			a = multiplyMatrices(a, a);   
			N /= 2;   
		}
		return result[0][0];
	}
	static int[][] multiplyMatrices(int[][] a, int[][] b) 
	{
	    int[][] result = new int[2][2];   
	    for (int i = 0; i < 2; i++) 
	        for (int j = 0; j < 2; j++) 
	            for (int k = 0; k < 2; k++) 
	                result[i][j]=(int)((result[i][j]+(long)a[i][k]*b[k][j])%modulus);
	    return result;   
	}
	public static void main(String[] args) 
	{
		System.out.println(countStrings(27661428758907L));
		System.out.println(countStrings(5L));
	}
}