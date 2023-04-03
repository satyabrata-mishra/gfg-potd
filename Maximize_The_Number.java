package cp;

public class Maximize_The_Number 
{
	public static String maximumNumber(String S, int K) 
    {
		char arr[] = S.toCharArray();
		for(int i=0;i<arr.length-1 && K>0;i++)
		{
			if(arr[i]=='0')
			{
				for(int j=arr.length-1;j>i;j--)
				{
					if(arr[j]=='1')
					{
						char temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
						--K;
						break;
					}
				}
			}
		}
		return new String(arr);
    }
	public static void main(String[] args) 
	{
		System.out.println(maximumNumber("00010",2));
		System.out.println(maximumNumber("1010",2));
		System.out.println(maximumNumber("1000",5));
		System.out.println(maximumNumber("0011100",2));
	}

}
