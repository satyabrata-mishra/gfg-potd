package cp;

public class Frogs_and_Jumps 
{
	public static int unvisitedLeaves(int N, int leaves, int frogs[]) 
    {
		boolean visitedLeaves[]=new boolean[leaves];
		for(int i=0;i<N;i++)
		{
			int temp=frogs[i]-1;
			if(temp<leaves && !visitedLeaves[temp])
			{
				while(temp<leaves)
				{
					visitedLeaves[temp]=true;
					temp+=frogs[i];
				}				
			}
		}
		int ans = 0;
		for(boolean i:visitedLeaves)
			if(!i)
				++ans;
		return ans;
    }
	public static void main(String[] args) 
	{
		int frogs[] = {3,2,4};
		int leaves=4;
		System.out.println(unvisitedLeaves(frogs.length,leaves,frogs));
	}

}
