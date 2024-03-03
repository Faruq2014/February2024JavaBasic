package accessModifier;

public class ProtectedAccessModifier {
	/*same class==yes
	 * same package=yes
	 * different package== yes-->is-a-relationship
	 *                          -->inheritance
	 * 
	 */

	public static void main(String[] args) {
		ProtectedAccessModifier proAccess= new ProtectedAccessModifier();
		proAccess.studentExchange();

	}
	
	protected static void studentExchange() {
		System.out.println("protected access modifier");
		
	}

}
