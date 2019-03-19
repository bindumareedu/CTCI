package StringandArrays;

public class StringRotation {
	
	public boolean isSubString(String s1, String s2) {
		String updatedString=s1+s1;
		if(updatedString.contains(s2))
			return true;
		else
			return false;
		
		
	}
	
	
	public static void main(String[] args) {
		String s1="waterbottle";
		String s2="bottlewater";
		StringRotation obj= new StringRotation();
		
		System.out.println(obj.isSubString(s1,s2));
	}
}
