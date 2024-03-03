package constructor;

public class DefaultConstructor {
	        static String dataBase="TEP_Student";
	        int studentID;
			String firstName;
			String lastName;
			String phone;
			String email;

			
	

	public static void main(String[] args) {
		
		DefaultConstructor dc= new DefaultConstructor();//this default constructor
		dc.studentInfo(1, "Faruq", "Molla", "7032869883", "jj@gmail.com");
		dc.studentInfo(2, "Razu", "Khan", "2022869883", "jj@gmail.com");
		//DefaultConstructor(); //this is static method with same name as class 
	}
	
	public static void DefaultConstructor() {
		
	}
	
	public void studentInfo(
			int studentID,
			String firstName,
			String lastName,
			String phone,
			String email
			) {
		System.out.println(
			" , dataBase "	+dataBase+
			" , studentID "+studentID +	
			" , firstName "+firstName +
			" , lastName " +lastName+
			" , phone "   +phone +
			" , email "  +email
				);
		
		
		
	}
	
	

}
