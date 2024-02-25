package variables;

public class LocalVariables {
	
	/*
	 * what is variable?
	 * it can change value as necessary
	 * it reserve space in the memory as you declare
	 * it is memory management
	 * it organize properties
	 */
	
	/*local variable golden rules:
	 *   double bankAccount=5000.00
	 *   double= data type
	 *   bankAccount= is the variable name
	 *  = is the operator
	 *  5000.00 is the value of the variable
	 *  
	 * Declaration
	 *    must declare data type
	 *    must have name of the variable to recognize by the jvm
	 *    = operator sign is must
	 *    must declare the value or initialize the value
	 *   
	 *  scope of the local variable
	 *    only inside the method
	 * 
	 * access modifier
	 *    only final is allow
	 */

	public static void main(String[] args) {
		LocalVariables lv = new LocalVariables();
		lv.faruq();
		
	}
	
	public void faruq() {
		
		double bankAccount=5000.00;
		final  String car="Sienna";
		System.out.print(bankAccount);
	}

	public void fabiha() {
		//System.out.print(bankAccount);	
	}
}
