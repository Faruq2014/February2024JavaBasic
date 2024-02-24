package dataType;

public class ReferentialData {

	public static void main(String[] args) {
		String firstName="Joe";
		// String is the data type
		//firstName is the variable name
		//Joe is the value of the variable
		
		String lastName="Biden"	;
		String fullName=firstName+lastName;
		//String fullName=firstName-lastName;
		//String data type only + operator is allow
		System.out.println(fullName);
		
		//concutination
		
		String fullName1=firstName+" "+lastName;
		System.out.println(fullName1);
		
		System.out.println("our presidant name is  "+fullName1);
		
	}

}
