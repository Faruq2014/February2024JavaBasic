package constructor;

public class UserDefineConstructor  {
	/*
	 * constructor instantiate/initialize instance properties
	 *        instance variable
	 *        Instance method
	 *        instance block
	 *        
	 *        User define constructor--> if you create a constructor that is called user define construcord
	 *        Jvm is not responsible to provide a constructor for that class
	 */
	//static variable== constructor will not initialize
	 static String dataBase="TEP_Student";
	 
	 // instance variables==constructor will initialize
        int studentID;
		String firstName;
		String lastName;
		String phone;
		String email;

		// user define constructor
	public UserDefineConstructor(
			int studentID, 
			String firstName, 
			String lastName, 
			String phone, 
			String email) {
		  
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
		schoolName();
		System.out.println("Data base Name==  "+dataBase);
		
UserDefineConstructor faruq= new UserDefineConstructor(01, "Faruq", "Molla", "888", "jj@gmail");
faruq.studentFee(300, 50);
//faruq is a class rerrencial variable build by constructor
// constructor instantiate all the instance variable 
// also instantiate studentFee(double seleniumFee, int admissionFee) method

UserDefineConstructor Salina= new UserDefineConstructor(02, "Salina", "Molla", "77", "ss@gmail");
Salina.studentFee(300, 0);


//UserDefineConstructor m= new UserDefineConstructor();
//since user define constructor is present, JVM is not providing default constructor
//m.studentFee(0, 0);
	}

	// instance method== constructor is responsible to call this method in the main method
	public void studentFee(double seleniumFee, int admissionFee) {
		
		System.out.println(" Money needs to be paid "+seleniumFee +admissionFee);
	}
	
	// static method== constructor is not responsible to call the static method
	public static void schoolName() {
		System.out.println("School name is TEP");
	}
	
	
}
