//Author: Bindu (smareedu@iu.edu)


//yet to complete



package StringandArrays;

public class urlify {
	
	public String adjustString(String Input, int trueLength)
	{
		char[] charify=Input.toCharArray();
		int i=0;
		char[] charify_temp=charify;
		int spaceCount=0;
		while (i<Input.length())
		{
			if(charify[i]==' ')
			{
				spaceCount++;
				i++;
				
			}
		}
		
//		while( i <charify.length)
//		{
//			if (charify[i]==' ')
//			{
//				int count=0;
//				int j=i;
//				char tem1,tem2;
//				while( j<charify.length-i-1 && charify[j]!=' ' )
//				{
//				//tem1=charify[j+1];
//				//tem2=charify[j+2];
//				charify[j+3]=charify[j+1];
//				j++;
//				}
////				int k=i+1;
////				for(int j=i+2;j<charify.length-i-1;j+=1)
////				{
////					System.out.println("Value of j"+j);
////					charify[j]=charify[j];
////					k++;	
////				}
//				charify[i]='%';
//				charify[i+1]='2';
//				charify[i+2]='0';
//				i+=3;
//				
//			}
//			
//				i++;
//		}
		String input= new String(charify);
		return input;
	}
	public static void main(String[] args)
	{
		String Input;
		urlify  obj=new urlify();
		StringBuilder inputArray=new StringBuilder();
		 Input="Mr John Smith    ";	
		 System.out.println("length"+Input.length());
		 System.out.println(obj.adjustString(Input, 13));
	}

}

//Author: Bindu (smareedu@iu.edu)

