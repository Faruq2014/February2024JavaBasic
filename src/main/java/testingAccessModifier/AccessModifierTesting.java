package testingAccessModifier;

import accessModifier.DefaultAccessModifier;
import accessModifier.ProtectedAccessModifier;
import accessModifier.PublicAccessModifier;

public class AccessModifierTesting extends ProtectedAccessModifier{

	public static void main(String[] args) {
		DefaultAccessModifier dam= new DefaultAccessModifier();
		//dam.teachersFees();
		//default access modifier is 
		//only allow in the same package
		
		//ProtectedAccessModifier proAccess= new ProtectedAccessModifier();
		studentExchange();
		
		PublicAccessModifier pub= new PublicAccessModifier();
		pub.schoolInfo();

	}

}
