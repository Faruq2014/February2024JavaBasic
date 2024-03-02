package method;

public class ChildWithMethodOverRidding extends Parent{
	/*
	 * child wants to modify parents method
	 * method signature must be same as parent
	 * if you have different signature than it is a new method
	 * you can not reduce the scope of the method
	 * you can increase the scope
	 * it is dynamic pollymorphism
	 */

	public static void main(String[] args) {
		ChildWithMethodOverRidding child= new ChildWithMethodOverRidding();
		
		child.fulName("Faruq", "Molla");
	}

	
	public String fulName(String firstName,String lastName) {
		 String middleName="Omar";
		 String fullName=firstName+" "+middleName+" "+lastName;
		 System.out.println(fullName);
		return fullName;
		 	}
}
