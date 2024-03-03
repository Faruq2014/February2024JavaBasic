package accessModifier;

public class PublicAccessModifier {
	/*
	 * access from any where
	 */

	public static void main(String[] args) {
		PublicAccessModifier pub= new PublicAccessModifier();
		pub.schoolInfo();

	}

	public void schoolInfo() {
		System.out.println("public method");
	}
}
