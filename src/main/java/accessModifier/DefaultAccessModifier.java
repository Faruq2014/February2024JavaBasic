package accessModifier;

public class DefaultAccessModifier {
/*
 * default access modifier
 *     from it's own class
 *     from same package possible 
 */
	public static void main(String[] args) {
		DefaultAccessModifier dam= new DefaultAccessModifier();
		dam.teachersFees();

	}
	
	
	void teachersFees() {
		System.out.println("hello default access modifier");
	}

}
