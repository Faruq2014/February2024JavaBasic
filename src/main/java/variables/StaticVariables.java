package variables;

public class StaticVariables {
	/*
	 * what is variable?
	 * it can change value as necessary
	 * it reserve space in the memory as you declare
	 * it is memory management
	 * it organize properties
	 */
	
	/*static variable golden rules:
	 * 
	 *     String lastName;
	 *     String= data type
	 *     lastName= is the variable name
	 *     = is the operator
	 *    Molla is the value of the variable
	 *  
	 * Declaration
	 *    must declare data type
	 *    must have name of the variable to recognize by the jvm
	 *    = operator sign is not must
	 *    if you do not declare the value then default value is 
	 *    the default value of the data type.
	 *     
	 *     initialization
	 *    declare of the value or initialize of the value is not must
	 *        normally we do intialize the value in the declaration.
	 *        constructor does not deal with static variables
	 *        
	 *   
	 *  scope of the static variable
	 *     inside the class
	 * 
	 * access modifier
	 *    any access modifier is allow
	 *    if you declare it final static then it became constant
	 */
    
      String firstName;
   static String lastName ="Molla";

   public static void main(String[] args) {
		StaticVariables sv= new StaticVariables();		
		sv.fabiha(); sv.faruq();
		sv.faiza();
		
	}
	
	public void faruq() {
		firstName="Faruq";
		
		System.out.println(firstName+" "+lastName);
	}
	
	public void fabiha() {
		firstName="Fabiha";
		
		System.out.println(firstName+" "+lastName);
	}
	public void faiza() {
		firstName="Faiza";
		lastName="Khan";
		System.out.println(firstName+" "+lastName);
	}

}
