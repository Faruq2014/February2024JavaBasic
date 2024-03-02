package method;

public class ParameteraziedMethod {

	public static void main(String[] args) {
		
		ParameteraziedMethod pm= new ParameteraziedMethod();
		pm.clientName();
		pm.clientName();
		pm.fullName("Taslima", "Khan");
		pm.fullName("Tahura", "Begum");
	}
	
	
	
	public String fullName(String firstName,String lastName) {
		// for dynamic coding
		// two arguments parameterized method
		// both are string arguments
		//parameterized arguments are local variables 
		//the caller has to provide the values of the variables
		
		    String fullName=firstName+" "+lastName;
		   System.out.println("Client full name is "+fullName);
		   return fullName;
	}
	
	
	
public String clientName() {
	//Zero arguments method
    //static coding
	   String firstName="Faruq";
	   String lastName="Molla";
	   String fullName=firstName+" "+lastName;
	   System.out.println("Client full name is "+fullName);
	return fullName;
	
	   
		
	
		
	}

}
