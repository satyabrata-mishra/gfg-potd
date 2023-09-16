package cp;

public class Counting_Minutes 
{
	public static int CountingMinutes(String str) 
	{
	    String time[]=str.split("-");
	    String firstTime[]=new String[3];
	    firstTime[0]=time[0].substring(0,time[0].indexOf(":"));
	    firstTime[1]=time[0].substring(time[0].indexOf(":")+1,time[0].length()-2);
	    firstTime[2]=time[0].substring(time[0].length()-2);
	    String secondTime[]=new String[3];
	    secondTime[0]=time[1].substring(0,time[1].indexOf(":"));
	    secondTime[1]=time[1].substring(time[1].indexOf(":")+1,time[1].length()-2);
	    secondTime[2]=time[1].substring(time[1].length()-2);
	    int firsthr=Integer.parseInt(firstTime[0]),secondhr=Integer.parseInt(secondTime[0]);
	    int firstmin=Integer.parseInt(firstTime[1]),secondmin=Integer.parseInt(secondTime[1]);
	    int ans = 0;
	    if(firstTime[2].equals(secondTime[2]))
	    	ans = (secondhr-firsthr)*60+(secondmin-firstmin);
	    else
	    	ans = ((12-firsthr)*60-firstmin)+((secondhr)*60+secondmin);
	    if(ans<0)
	    	return 1440+ans;
	    return ans;
	}
	public static void main(String[] args) 
	{
		System.out.println(CountingMinutes("2:45pm-2:50am")+"mins");
	}
}