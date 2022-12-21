package cp;
public class Check_if_it_is_possible_to_convert_one_string_into_another_with_given_constraints 
{
	public static int isItPossible(String S, String T, int M, int N) 
    {
		 if(M!=N)
			 return 0;
		 int i=0,j=0;
		 while(true)
		 {
			 while(i<M)
			 {
	                if(S.charAt(i)!='#')
	                    break;
	                i++;    
			 }
			 while(j<N)
			 {
				 if(T.charAt(j)!='#')
					 break;
				 j++;    
			 }
			 if(i<M && j<N)
			 {
				 if(S.charAt(i)!=T.charAt(j))
					 return 0;
				 else
				 {                           
					 if(S.charAt(i)=='A' && i<j)
	                        return 0;
					 if(S.charAt(i)=='B' && i>j)
	                        return 0;
				 }    
				 i++;
				 j++;
	            }
	            else if(i>=M && j<N || i<M && j>=N)
	                return 0;
	            else
	                break;
	        }        
	        return 1;
    }
	public static void main(String[] args) 
	{
		String s="#A#B#B#",t="A###B#B";
		System.out.println(isItPossible(s,t,s.length(),t.length()));
	}

}
