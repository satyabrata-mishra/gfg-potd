package cp;

public class Finding_Profession 
{
	static char profession(int level, int pos)
    {
        boolean isopp=false;
        while(pos != 1)
        {
            if(pos%2 == 0)
                isopp = !isopp;
            pos = (pos+1)/2;
        }
        return isopp? 'd' : 'e';
    }
	public static void main(String[] args) 
	{
		if (profession(4,2)=='d')
			System.out.println("Doctor");
		else
			System.out.println("Engineer");
			
	}

}
