package method;

public class MethodOverloading {
/*
 * what is method over loading
 *   same method name with Different method signature
 *     java does allow same name method
 *     java does not allow same name method with same signature
 *  how does java compiler understand that which method I am calling
 *     by method signature
 *     
 *     static pollymorphism
 *  
 */
	public static void main(String[] args) {
		MethodOverloading mol= new MethodOverloading();
		mol.student();
		mol.student(01);
		mol.student(10, "Taslima");
		mol.student("Taslima", "Khan");
		mol.student(10, 300);
		//how does java compiler understand that which method I am calling
                 //by method signature
	}
	
	public void student() {
		System.out.println("0 argument student method");
	}
	
   public int student(int studentID) {
	   System.out.println("1 argument student method");
	return studentID;
			
	}
	
   public int student(int studentID, String studentName) {
	   System.out.println(studentID+" "+studentName);
	   System.out.println("2 mix argument student method");
		return studentID;
				
		}
   
   public String student(String firstName, String studentName) {
	   System.out.println(firstName +" "+studentName);
	   System.out.println("2 string argument student method");
	return studentName;
		
				
		}
   
   public String student(int studentTutionFee, int lateFee) {
	  int totalPayment= studentTutionFee+lateFee;
	  int differentPayment= studentTutionFee-lateFee;
	  
	  System.out.println(totalPayment+" "+ differentPayment );
	   System.out.println("2 int argument student method");
	return null;

		
				
		}

}
