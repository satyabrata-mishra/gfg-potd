package cp;

public class Wifi_Range 
{
	public static  boolean wifiRange(int N, String S, int X) 
    { 
        int dist=X;
        for(int i=0;i<N;i++)
        {
            if(S.charAt(i)=='1')
            {
                if(dist>2*X) 
                    return false;
                dist=0;
            }
            else
                dist++;
        }
        if(dist>X) 
            return false;
        return true;
    }
	public static void main(String[] args) 
	{
		String s = "010";
		System.out.println(wifiRange(s.length(),s,0)?"1":"0");
	}

}
