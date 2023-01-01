package cp;
import java.util.*;
public class Asteroid_Collision
{
	public static int[] asteroidCollision(int N, int[] asteroids) 
	{
		Stack<Integer> st=new Stack<>();
        st.push(asteroids[0]);
        for(int i=1;i<N;i++)
        {
            if(asteroids[i]>0)
                st.push(asteroids[i]);
            else
            {
                while(st.size()>0 && st.peek()>0 && Math.abs(asteroids[i])>st.peek())
                	st.pop();
                if(st.size()>0 && Math.abs(asteroids[i])==st.peek())
                	st.pop();
                else if(st.size()==0 || st.peek()<0)
                	st.push(asteroids[i]);
            }
        }
        int ans[]=new int[st.size()];
        for(int i=ans.length-1;i>=0;i--)
        	ans[i]=st.pop();
        return ans;
	}
	public static void main(String[] args)
	{
//and the sign represents its direction (positive meaning right, negative meaning left)
		int asteroids[ ] = {-5, 5, 2, 1, 1, -2};
		asteroids=asteroidCollision(asteroids.length,asteroids);
		for(int i:asteroids)
			System.out.print(i+" ");
	}

}
