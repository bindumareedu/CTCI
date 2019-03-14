//Author: Bindu (smareedu@iu.edu)

package StringandArrays;
import java.util.*;

public class stringCompression {
	public StringBuilder compression(String input)
	{
		StringBuilder str= new StringBuilder();
		StringBuilder inputSB= new StringBuilder();
		inputSB.append(input);

		char[] inputArray=input.toCharArray();
		int i=0;
		int charCount=0;
		//traversing through the array till the end.
		for(i=0;i<=inputArray.length-1;i++)
		{	
			//right side of OR: whenever the current character is not same as its next character, then add the character with the incremented count to str.
			//left side of OR (dealing with the last character and its count): if the index is at the end, then add the character and its count
			if(i==inputArray.length-1 || inputArray[i]!=inputArray[i+1] )
			{
				charCount++;
				str.append(inputArray[i]);
				str.append(charCount);
				charCount=0;
			}
			else	
				charCount++;
		}
		System.out.println("input strings length "+inputSB.length()+"\t compressed strings length "+str.length());
		if(inputSB.length()>str.length()) return str;
		else return inputSB;

	
		

	}
	public static void main(String[] args)
	{
		stringCompression obj= new stringCompression();
		
		String input="aabccccaaa";
		System.out.println("Actual String is " +input);
		System.out.println("Compressed String is : " +obj.compression(input));
	}

}





//Author: Bindu (smareedu@iu.edu)

