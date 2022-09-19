package cp;
public class Minimum_Exchange 
{
	public static int MinimumExchange(char[][] matrix)
    {
		int m = matrix.length;
        int n = matrix[0].length;
        int cost1 = 0, cost2=0;
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                char req_ch = (i%2==j%2 ? 'A' : 'B');
                if(req_ch!=matrix[i][j]) 
                	cost1++;
                else 
                	cost2++;
            }
        }
        return Math.min(cost1, cost2);
    }
	public static void main(String[] args) 
	{
		char matrix[][] =  {{'A','A','B','A'},
							{'B','A','B','A'},
							{'B','B','A','B'}};
		System.out.println(MinimumExchange(matrix));
	}

}
