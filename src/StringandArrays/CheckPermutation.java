
//Author: Bindu (smareedu@iu.edu)

package StringandArrays;

import java.util.Arrays;
import java.util.HashMap;

//using Sort

/*
public class CheckPermutation {
	  
	public boolean isPermutation(String word1, String word2)
	{
		char[] aword1=word1.toCharArray();
		char[] aword2=word2.toCharArray();
		Arrays.sort(aword1);
		String sortedWord1=new String(aword1);
		Arrays.sort(aword2);
		String sortedWord2=new String(aword2);

		if(sortedWord1.equals(sortedWord2))
			return true;
		else return false;
	
	}
	
	public static void main(String[] args)
	{
		CheckPermutation obj=new CheckPermutation();
		System.out.println("Is one string permutation of another?"+obj.isPermutation("abcdefaghga","abcadefghga"));
	}

}
*/

//Using HashMAp

public class CheckPermutation {
	  
	public boolean isPermutation(String word1, String word2)
	{
		char[] aword1=word1.toCharArray();
		char[] aword2=word2.toCharArray();
		HashMap<Character,Integer> dict1= new HashMap<>();
		HashMap<Character,Integer> dict2= new HashMap<>();
		for(char i : aword1)
		{
			if (dict1.containsKey(i))
			{
				dict1.put(i,dict1.get(i)+1);
			}
			else
				dict1.put(i,1);
		}
		for(char i : aword2)
		{
			if (dict2.containsKey(i))
			{
				dict2.put(i,dict2.get(i)+1);

			}
			else
				dict2.put(i,1);
		}



		if(dict1.equals(dict2))
			return true;
		else return false;
	
	}
	
	public static void main(String[] args)
	{
		CheckPermutation obj=new CheckPermutation();
		System.out.println("Is one string permutation of another?"+obj.isPermutation("abacdefaghga","abcdefagahga"));
	}

}


//Author: Bindu (smareedu@iu.edu)

