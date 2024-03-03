package constructor;

public class ConstructorOverloading {
	/*
	 *  same class/constructor name with Different signature
	 *     java allow multiple constructor
	 *     signature must be different
	 *  how does java compiler understand that which constructor I am calling
	 *     by  signature
	
	*/
	
	    int studentID;
		String firstName;
		String lastName;
		String phone;
		String email;
		
		//mandatory constructor
	public ConstructorOverloading(int studentID, String lastName, String phone) {
			super();
			this.studentID = studentID;
			this.lastName = lastName;
			this.phone = phone;
			
            System.out.println(
					
					"studentID== "+studentID +						
					", lastName== " +lastName+
					", phone== "   +phone
					
						);
				
			
			
		}
	


	

// constructor without email account
	public ConstructorOverloading(int studentID, String firstName, String lastName, String phone) {
		super();
		this.studentID = studentID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		
		System.out.println(
				
				"studentID== "+studentID +	
				", firstName== "+firstName +
				", lastName== " +lastName+
				", phone== "   +phone				
					);
			
	}






	public ConstructorOverloading(int studentID, String firstName, String lastName, String phone, String email) {
		super();
		this.studentID = studentID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		
		System.out.println(
				
				"studentID== "+studentID +	
				", firstName== "+firstName +
				", lastName== " +lastName+
				", phone== "   +phone +
				", email== "  +email
					);
			
	}



	public static void main(String[] args) {
		
		ConstructorOverloading razu= new ConstructorOverloading(03, "Mohammed", "rm@gmail");
		razu.studentFee(300, 50);
		ConstructorOverloading belal= new ConstructorOverloading(04, "Bellal", "Khab", "bk@gmail");
		belal.studentFee(300, 0);
		
		ConstructorOverloading shirin= new ConstructorOverloading(04, "Shirin", "A", "5555", "SA@gmai");
		shirin.studentFee(400, 50);
	
	}

	
public void studentFee(double seleniumFee, int admissionFee) {
	double totalePayment=seleniumFee +admissionFee;
		System.out.println(" Money needs to be paid "+totalePayment);
	}
	
}
