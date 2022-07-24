package cp;

public class Levels_Of_The_Game 
{
	public static int maxLevel(int h,int m) 
    {
		int flag=1,level=0;
        while(h>0 && m>0)
        {
            if(flag==1)
            {
                h+=3;
                m+=2;
                level++;
                flag=0;
            }
            else
            {
                flag=1;
                level++;
                if(h>5 && m>10)
                {
                    h-=5;
                    m-=10;
                }
                else if(h>20)
                {
                    h-=20;
                    m+=5;
                }
                else 
                {
                    level--;
                    break;
                }
            }
        }
        return level;
    }
	public static void main(String[] args) 
	{
		System.out.println(maxLevel(20,8));
	}

}
