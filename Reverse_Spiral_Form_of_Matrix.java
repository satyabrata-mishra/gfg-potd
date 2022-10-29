package cp;
import java.util.*;
public class Reverse_Spiral_Form_of_Matrix 
{
	public static int[] reverseSpiral(int R, int C, int[][] a)
    {
		ArrayList<Integer> al=new ArrayList<>();
		int m = R,n = C,strow = 0,stcol = 0,endrow = m - 1,endcol = n - 1;
		while (strow <= endrow && stcol <= endcol) 
		{
		    // left to right (1st row -outer top)
		    for (int i = stcol; i <= endcol; i++) 
		        al.add(a[strow][i]);
		    // top to bottom (1st col -outer)
		    for (int j = strow + 1; j <= endrow; j++)
		        al.add(a[j][endcol]);
		    //  right to left (1st row -outer bottom
		    for (int i = endcol - 1; i >= stcol; i--) 
		    {
		        if (strow==endrow) 
		        	break;
		        al.add(a[endrow][i]);
		    }
		    // bottom to top (1st col-outer)
		    for (int j = endrow - 1; j >= strow + 1; j--) 
		    {
		        if (stcol==endcol) 
		        	break;
		        al.add(a[j][stcol]);
		    }
		    stcol++;strow++;endcol--;endrow--;
		}
        Collections.reverse(al);
        int[] arr = new int[al.size()];
        for (int i = 0; i < al.size(); i++)
            arr[i] = al.get(i);
        return arr;
    }
	public static void main(String[] args)
	{
		int r=3,c=3;
		int a[][]= {{9, 8, 7},
			       {6, 5, 4},
			       {3, 2, 1}};
		int temp[]=reverseSpiral(r,c,a);
		for(int i:temp)
			System.out.print(i+" ");
	}
}