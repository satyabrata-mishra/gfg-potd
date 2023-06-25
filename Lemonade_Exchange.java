package cp;
public class Lemonade_Exchange 
{
	public static boolean lemonadeChange(int N, int bills[])
    {
		 int cFive = 0, cTen = 0;
		 for (int i:bills) 
		 {
			 if (i==5)
				 cFive++; 
			 else if (i==10) 
			 {
				 if (cFive<1) 
					 return false; // Cannot provide change
				 cFive--;
				 cTen++;
			 } 
			 else if (i==20) 
			 {
				 if (cFive >= 1 && cTen >= 1) 
				 {
					 cFive--;
					 cTen--;
				 } 
				 else if (cFive >= 3) 
					 cFive -= 3; 
				 else 
					 return false; 
			 }
		 }
		 return true;
    }
	public static void main(String[] args) 
	{
		int bills[] = {5, 5, 10, 10, 20};
		System.out.println(lemonadeChange(bills.length,bills));
	}
}