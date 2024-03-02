package method;

public class MethodSinature {
	/*
	 * method signature=method name+ parameter
	 *homogeneous and non homogeneous data allow in the method signature
	 */

	public static void main(String[] args) {
		MethodSinature ms= new MethodSinature();
		ms.student("Razu", 10);
		

	}
	
	
	
	public String fullName(String firstName,String lastName) {
		return lastName;
		
		//public String fullName()
		
		// public= access modifier
		// String= data type
		//fullName= method name
		//(String firstName,String lastName)= two arguments/ variables parameter
		//method signature=method name+ parameter==two string arguments fullName
		// {}= scope of the method
		// return = is the last statement
		//return lastName;== argument
		// a
		
	}
	
	
	
public String clientName() {
	//public String clientName()
	
	// public= access modifier
	// String= data type
	//clientName= method name
	//()= parameter
	// {}= scope of the method
	// return = is the last statement
	//return null;== 0 argument
	return null;
	
}
	   
public void student(String name, int studentID) {
	System.out.println("Student identity "+name+" "+studentID);
	
	//public void student(String name, int studentID)
	
			// public= access modifier
			// void= return type
			//student= method name
			//(String name, int studentID)= two different arguments
			//method signature=method name+ parameter==two mix arguments student
			// {}= scope of the method
			
	
}
		
	

}
