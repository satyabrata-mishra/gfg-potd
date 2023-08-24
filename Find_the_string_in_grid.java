package cp;
import java.util.*;
public class Find_the_string_in_grid 
{
	public static int[][] searchWord(char[][] grid, String word)
    {
		int r=grid.length,c=grid[0].length,wordlen=word.length();
		char wordarr[]=word.toCharArray();
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				int ind=0,fr=i,fc=j;
				boolean flag=true;
				//Right
				while(flag && fc+1<=c && ind<wordlen && grid[fr][fc]==wordarr[ind])
				{
					fc++;
					ind++; 
				}
				if(ind==wordlen)
				{
					list.add(new ArrayList<Integer>(Arrays.asList(i,j)));
					flag=false;
				}
				//Bottom
				ind=0;
				fr=i;
				fc=j;
				while(flag && fr+1<=r && ind<wordlen && grid[fr][fc]==wordarr[ind])
				{
					fr++;
					ind++;
				}
				if(ind==wordlen)
				{
					list.add(new ArrayList<Integer>(Arrays.asList(i,j)));
					flag=false;
				}
				//Left
				ind=0;
				fr=i;
				fc=j;
				while(flag && fc-1>=-1 && ind<wordlen && grid[fr][fc]==wordarr[ind])
				{
					fc--;
					ind++;
				}
				if(ind==wordlen)
				{
					list.add(new ArrayList<Integer>(Arrays.asList(i,j)));
					flag=false;
				}
				//Up
				ind=0;
				fr=i;
				fc=j;
				while(flag && fr-1>=-1 && ind<wordlen && grid[fr][fc]==wordarr[ind])
				{
					fr--;
					ind++;
				}
				if(ind==wordlen)
				{
					list.add(new ArrayList<Integer>(Arrays.asList(i,j)));
					flag=false;
				}
				//Top right
				ind=0;
				fr=i;
				fc=j;
				while(flag && fr-1>=-1 && fc+1<=c && ind<wordlen && grid[fr][fc]==wordarr[ind])
				{
					fr--;
					fc++;
					ind++;
				}
				if(ind==wordlen)
				{
					list.add(new ArrayList<Integer>(Arrays.asList(i,j)));
					flag=false;
				}
				//Bottom Right
				ind=0;
				fr=i;
				fc=j;
				while(flag && fr+1<=r && fc+1<=c && ind<wordlen && grid[fr][fc]==wordarr[ind])
				{
					fr++;
					fc++;
					ind++;
				}
				if(ind==wordlen)
				{
					list.add(new ArrayList<Integer>(Arrays.asList(i,j)));
					flag=false;
				}
				//Bottom Left
				ind=0;
				fr=i;
				fc=j;
				while(flag && fr+1<=r && fc-1>=-1 && ind<wordlen && grid[fr][fc]==wordarr[ind])
				{
					fc--;
					fr++;
					ind++;
				}
				if(ind==wordlen)
				{
					list.add(new ArrayList<Integer>(Arrays.asList(i,j)));
					flag=false;
				}
				//Top Left
				ind=0;
				fr=i;
				fc=j;
				while(flag && fr-1>=-1 && fc-1>=-1 && ind<wordlen && grid[fr][fc]==wordarr[ind])
				{
					fc--;
					fr--;
					ind++;
				}
				if(ind==wordlen)
				{
					list.add(new ArrayList<Integer>(Arrays.asList(i,j)));
					flag=false;
				}
			}
		}
		int ans[][]=new int[list.size()][2];
		for(int i=0;i<list.size();i++)
		{
			ans[i][0]=list.get(i).get(0);
			ans[i][1]=list.get(i).get(1);
		}
		return ans;
    }
	public static void main(String[] args) 
	{
		char grid[][] ={{'a','b','a','b'},
						{'a','b','e','b'},
						{'e','b','e','b'}};
		String word="eba";
		int ans[][]=searchWord(grid, word);
		for(int i=0;i<ans.length;i++)
			System.out.println(ans[i][0]+" , "+ans[i][1]);
	}
}