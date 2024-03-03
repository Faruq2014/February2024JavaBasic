package accessModifier;

public class PrivateAccessModifier {
	/*
	 * private access modifier is the most restricted
	 * only access to the class level
	 * 
	 */
	private int studentID;
	private String firstName;
	private String lastName;
	private String phone;
	private String email;
	
	
	public PrivateAccessModifier(int studentID, String firstName, String lastName, String phone, String email) {
		super();
		this.studentID = studentID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
	}


	public PrivateAccessModifier() {
		super();
		
	}


	public static void main(String[] args) {
		PrivateAccessModifier pam= new PrivateAccessModifier();
		pam.studentFee();
		pam.studentID=01;
		
		

	}

	
	private void studentFee() {
		System.out.println("I am private method");
	}
}
