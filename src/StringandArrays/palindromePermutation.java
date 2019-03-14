
//Author: Bindu (smareedu@iu.edu)


package StringandArrays;
import java.util.*;

public class palindromePermutation {
	public boolean isPermutation(String input){
		char[] charInput=input.toUpperCase().toCharArray();
		boolean flag=true;
		HashMap<Character,Integer> charCount=new HashMap<>();
		int oddCount=0;
		for(char i : charInput)
		{
			if(i != ' ')
			{
				if (charCount.containsKey(i))
					charCount.put(i,charCount.get(i)+1);
				else
					charCount.put(i, 1);	
			}
		}
		for(Integer value: charCount.values())
			if(value%2 !=0) oddCount++;				
		if(oddCount > 1) flag=false;
		
		return flag;
	}


public static void main(String[] args)
{
	String input="peeeep";
	palindromePermutation obj=new palindromePermutation();
	System.out.println("Does Palindrome permutation exist? "+obj.isPermutation(input));
}
}


//Author: Bindu (smareedu@iu.edu)
