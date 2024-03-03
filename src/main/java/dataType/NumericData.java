package dataType;

public class NumericData {

	

	public NumericData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		/*
		 * go to shopping with 20 dollar
		 * buy apple for 
		 * buy cookies
		 * bring change back
		 * 
		 */
		
		//same data type
	 int totalMoney=20;
	 int apple=5;
	 //int is the data type, apple is the variable name, 5=is the value of the variable
	 int cookies=10;
	 int totalSpent=apple+cookies;
	 System.out.println("total spent "+totalSpent);
		
	 int changeLeft=totalMoney-totalSpent;
	 System.out.println("Change left "+changeLeft);
	 
	 
	 /*
		 * go to shopping with 20.00 dollar
		 * buy pen for 
		 * buy book
		 * bring change back
		 * 
		 */
	 
	 //mix and match
	 
	long moneyGiven=20;
	
	int pen=3;
	short book=5;
	//int pen1=1234567890;
	//short book1=12345;
	
	int expense=pen+book;
	// since we are adding int = short, then we have to declare bigger data type for the calculation
	// this is called super container
	
	long changeBack=moneyGiven-expense;
	// since we are substurcting long =int, then we have to declare bigger data type for the calculation
		// this is called super container
	// between long and int == long is the bigger data type
	

	
	 /*
	 * go to shopping with 20000.00 dollar
	 * buy 3 phone for 
	 * buy 4 ipad
	 * bring change back
	 * use decimal mix data==double(64) and float(32)
	 */
	
	double dollar=20000.00;
	float iphone=1200.99f;
	float totalIPhone=iphone*3;
	double ipad=500.55;
	double totalIpad=ipad*4;
	double spentTotal=totalIPhone +totalIpad;
	System.out.println(spentTotal);
	
	}
	
}
