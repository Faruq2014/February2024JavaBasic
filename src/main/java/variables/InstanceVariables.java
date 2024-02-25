package variables;

public class InstanceVariables {
	/*Instance variable golden rules:
	 * 
	 *     String firstName;
	 *     String= data type
	 *     firstName= is the variable name
	 *     = is the operator
	 *    Mohammed is the value of the variable
	 *  
	 * Declaration
	 *    must declare data type
	 *    must have name of the variable to recognize by the jvm
	 *    = operator sign is not must
	 *    if you do not declare the value then default value is 
	 *    the default vlue of the data type.
	 *     
	 *     initialization
	 *    declare of the value or initialize of the value is not must
	 *        normally we do not intialize the value in the declaration.
	 *        normally constructor intialize the value or
	 *        method intialize the value
	 *   
	 *  scope of the instance variable
	 *     inside the class
	 * 
	 * access modifier
	 *    any access modifier is allow
	 */
    
	
	final int roll=1;
	double saving;
	private String firstName;
	public String firstName1="Mohammed";
	

	public static void main(String[] args) {
		
		InstanceVariables iv= new InstanceVariables();
		System.out.println(iv.roll);
		System.out.println(iv.saving);
		System.out.println(iv.firstName);
		System.out.println(iv.firstName1);
		iv.faruq();
		iv.fabiha();
		

	}
	
	public void faruq() {
		firstName="Faruq";
		System.out.println(firstName);
	}
	
public void fabiha() {
	firstName="Fabiha";
	System.out.println(firstName);
	}

}
