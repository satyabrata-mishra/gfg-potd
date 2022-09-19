package cp;

public class Count_occurences_of_a_given_word_in_a_2_d_array 
{
	static int result = 0;
	static boolean isSafe(char mat[][],int r,int c)
    {
        int rLen = mat.length,cLen = mat[0].length;
        if((r >= 0 && r < rLen)&&(c >= 0 && c < cLen))
        return true;
        return false;
    }
	public static void dfs(char mat[][],int i,int r, int c,String target)
    {
        if(!isSafe(mat,r,c)) return;
        if(i == target.length()) return;
        char ch = target.charAt(i);
        if(ch != mat[r][c]) return;
 
        if(i == target.length()-1)
        {
            result+=1;
            return;
        }
        mat[r][c] = '$';
         
        dfs(mat,i+1,r+1,c,target);
        dfs(mat,i+1,r-1,c,target);
        dfs(mat,i+1,r,c+1,target);
        dfs(mat,i+1,r,c-1,target);
        
        mat[r][c] = ch;
        
    }
	public static int findOccurrence(char mat[][], String target)
    {
		for(int i = 0;i < mat.length;i++)
            for(int j = 0; j < mat[i].length;j++)
                if(mat[i][j] == target.charAt(0))
                     dfs(mat,0,i,j,target);
        return result;
    }
	public static void main(String[] args) 
	{
		char mat[][] = {{'S','N','B','S','N'},
			       		{'B','A','K','E','A'},
			       		{'B','K','B','B','K'},
			       		{'S','E','B','S','E'}};
		String target = "SNAKES";
		System.out.println(findOccurrence(mat,target));
	}

}
