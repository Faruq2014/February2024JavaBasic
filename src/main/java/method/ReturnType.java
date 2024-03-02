package method;

public class ReturnType {
	/*
	 *  *    2. based on Return type there are two types of method
     *           void method 
     *           return method
     *           
     *  void method 
     *     return nothing
     *     no modification allow
     *    
     *  return method
     *   return something as data type
	 */

	public static void main(String[] args) {
		ReturnType rt= new ReturnType();
		rt.clientName();
		rt.savingAccount();
		 //savingAccount() is a void method
		 // no modification allow
		
		//****************
		int moreMoney=2000;
		double currentBalande=rt.checkingAccount();
		double latestBalance=moreMoney+currentBalande;
		System.out.println("latestBalance  "+latestBalance);
		//checkingAccount() is a return type method
		// any modification is allow
		
	}
	
	public void savingAccount() {
		double balance=2000.00;
		double deposit=3000.00;
		double currentBalance=balance+deposit;
		System.out.println("saving ac balance "+currentBalance);
		
	}
	
   public Double checkingAccount() {
	        //you must declare data type
	       //Homogeneous data type allow==all primitive data 
	 		//lots of over ridden rule applicable
	 		//lots of method over loading rule applicable
	 		//return statement must be the last statement or syntax
	       
	    double balance=13000.00;
		int deposit=4000;
		double currentBalance=balance+deposit;
		System.out.println("checking ac balance "+currentBalance);
		return currentBalance;
		
		
		
	}
   public String clientName() {
	   String firstName="Faruq";
	   String lastName="Molla";
	   String fullName=firstName+" "+lastName;
	   System.out.println("Client full name is "+fullName);
	return fullName;
	
	   
		
 	}

}
