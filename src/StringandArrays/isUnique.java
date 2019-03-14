
//Author: Bindu (smareedu@iu.edu)


package StringandArrays;
import java.util.*;
public class isUnique {
	
	public boolean unique(String word)
	{
		char[] array=word.toCharArray();
		boolean flag=true;
		Arrays.sort(array);
		for(int i=0; i<array.length-1;i++)
		{
			if (array[i]==array[i+1])
			{
				flag=false;
				break;
			}
		}
		
		return flag;
		
	}
	
	public static void main(String[] args)
	{
		isUnique obj=new isUnique();
		System.out.println("Does the string contain unique characters? "+obj.unique("abcdc"));
	}
	

}

//Author: Bindu (smareedu@iu.edu)

