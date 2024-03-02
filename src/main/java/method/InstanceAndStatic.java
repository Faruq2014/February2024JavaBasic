package method;

public class InstanceAndStatic {
/*
 * Types of Method
 *    1. access specifier
 *        instance method
 *        static method
 * static method always on
 * instance method as need as 
 *  access level
 *   static properties need not permission to access to any one
 *          ********** direct access***********
 *       static going inside of static method == directly
 *       static going inside of instance method == directly
 *          instance going inside of instance method == directly
 *     
 *     ************ indirect access  **************
 *      instance going inside of static method == indirectly
 *      golden rule:  className name= new className()
 *                            name.properties;
 *   
 *   what is method calling
 *    one method call another method as needed
 *     be very careful of instance method
 *     
 *     
 *     what is method chaining
 *        multiple method calling each other as needed
 */
	public static void main(String[] args) {
		// main method always static
		//Messenger is static method, so direct access
		messanger();
		
		//className name= new className()
		// name.properties;
		InstanceAndStatic ias= new InstanceAndStatic();
		ias.login();
		//login() method is instance method
		// coming inside the static main method
		// so it has indirect access
	}
	
	public void login() {
		System.out.println("I am login instance method");
		messanger();
		m1();
		//m1() method instance
		// login() method also instance
		// direct access
	}
	public void m1() {
		System.out.println("I am m1 instance method");
	}
	
	
	public static void messanger() {
		System.out.println("I am messanger static method");
		 m2();
	}
	
	public static void m2() {
		System.out.println("I am m2 static method");
	}

}
