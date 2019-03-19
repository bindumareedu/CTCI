package StringandArrays;

import java.util.*;

public class OneAway {
	private static Boolean isOneAway(String string, String string2) {
		boolean checkFailed=false;
		int i=0, j=0;
		if (string.equals(string2)) {
			return true;
		}
		String small= string.length()>string2.length() ? string2 :string;
		String big=string.length()>string2.length() ? string : string2;
	    if(big.length()-small.length()>1) {
	    	return false;
	    }
	    else {
	    	while(i<small.length() && j<big.length())
	    	{
	    		if(small.charAt(i)!=big.charAt(j)) {
	    			if(checkFailed) {
	    				return false;
	    			}	    		
	    			else {    				
		    			checkFailed=true;	
	    				i++;
	    			}
	    		}
	    		else {
	    			j++;
	    			i++;
	    		}		
	    	}
	    }
	    return true;
	
	
	
	}
	public static void main(String[] args) {
		System.out.println(isOneAway("abcd", "abcd"));
	}
}
	