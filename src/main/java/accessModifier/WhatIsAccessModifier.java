package accessModifier;

public class WhatIsAccessModifier {
	/*how many access modifier
	 *    public==access from any where
	 *    
	 *    protected== same class== yes
	 *                same package== yes
	 *                different package=yes with inheritance
	 *                 
	 *      default== same class==yes
	 *                same package=yes
	 *                Different package=no
	 *                
	 *    private== only same class
	 * 
	 */

	public static void main(String[] args) {
		PrivateAccessModifier pam= new PrivateAccessModifier();
		// we can not access private properties from PrivateAccessModifier
		
		//default
		DefaultAccessModifier dam= new DefaultAccessModifier();
		dam.teachersFees();
		
		//protected
		ProtectedAccessModifier proAccess= new ProtectedAccessModifier();
		proAccess.studentExchange();
		
		PublicAccessModifier pub= new PublicAccessModifier();
		pub.schoolInfo();

	}

}
