package cp;
public class Alternate_Vowel_and_Consonant_String 
{
	public static String rearrange(String S, int N)
    {
		int vowels[]=new int[26];
		int consonants[]=new int[26];
		int noOfVowels=0,noOfConsonants=0;
		char smallestVowel='u',smallestConsonant='z';
		for(char c:S.toCharArray())
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				vowels[c-'a']++;
				++noOfVowels;
				smallestVowel=(char)Math.min((int)smallestVowel,(int)c);
			}
			else
			{
				consonants[c-'a']++;
				++noOfConsonants;
				smallestConsonant=(char)Math.min((int)smallestConsonant,(int)c);
			}
		if(Math.abs(noOfVowels-noOfConsonants)>1)
			return "-1";
		boolean isVowel=false;
		if(noOfVowels>noOfConsonants)
			isVowel=true;
		else if(noOfVowels<noOfConsonants)
			isVowel=false;
		else 
			if(smallestVowel<smallestConsonant)
				isVowel=true;
			else
				isVowel=false;
        StringBuilder ans = new StringBuilder();
        int i=0,j=0;
        while(i<26 && j<26)
        	if(isVowel)
        	{
        		while(i<26 && vowels[i]==0)
        			++i;
        		if(i==26)
        			break;
        		ans.append((char)('a'+i));
        		vowels[i]--;
        		isVowel=false;
        	}
        	else
        	{
        		while(j<26 && consonants[j]==0)
        			++j;
        		if(j==26)
        			break;
        		ans.append((char)('a'+j));
        		consonants[j]--;
        		isVowel=true;
        	}
        return ans.toString();
    }
	public static void main(String[] args) 
	{
		String ans = "aeroplane";
		System.out.println(rearrange(ans,ans.length()));
	}

}
