package cp;
import java.util.*;
public class Form_A_Coil 
{
	public static ArrayList<Integer> formCoils(int n)
	{
		ArrayList<Integer> x=new ArrayList<Integer>();
		// Number of elements in each coil 
        int m = 8 * n * n; 
        // Let us fill elements in coil 1. 
        int coil1[] = new int[m]; 
        // First element of coil1 
        // 4*n*2*n + 2*n; 
        coil1[0] = 8 * n * n + 2 * n; 
        int curr = coil1[0]; 
        int nflg = 1, step = 2; 
        // Fill remaining m-1 elements in coil1[] 
        int index = 1; 
        while (index < m) 
        { 
            // Fill elements of current step from 
            // down to up 
            for (int i = 0; i < step; i++)  
                { 
                    // Next element from current element 
                    curr = coil1[index++] = (curr - 4 * n * nflg); 
                    if (index >= m) 
                    break; 
                } 
            if (index >= m) 
                break; 
          
            // Fill elements of current step from 
            // up to down. 
            for (int i = 0; i < step; i++)  
            { 
                curr = coil1[index++] = curr + nflg; 
                if (index >= m) 
                break; 
            } 
              
            nflg = nflg * (-1); 
            step += 2; 
        } 
        /* get coil2 from coil1 */
        int coil2[] = new int[m]; 
        for (int i = 0; i < 8 * n * n; i++) 
            coil2[i] = 16 * n * n + 1 - coil1[i]; 
        // Print both coils 
        System.out.print("Coil 1 : "); 
          
        for (int i = 0; i < 8 * n * n; i++) 
            System.out.print(coil1[i] + " "); 
        System.out.print("Coil 2 : "); 
        for (int i = 0; i < 8 * n * n; i++) 
            System.out.print(coil2[i] + " ");
        return x;
	}
	public static void main(String[] args) 
	{
		ArrayList<Integer> x =formCoils(1);
		System.out.println(x);
	}

}
