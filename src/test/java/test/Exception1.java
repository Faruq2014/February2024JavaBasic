package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception1 {
	
	public static void main(String[] args) {
		try {
			int a=30,b=0;
			int c=a/b;
     System.out.println(c);
		} catch (java.lang.ArithmeticException e) {
			
		e.printStackTrace();
			
		}
		
		//2nd
		try {
			 String  str=null;
			System.out.println(str);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		//3rd
		
		File someFile = new File("E://some_file.txt");
		try {
			FileReader fileReader = new FileReader(someFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("No such file !!");
		}
	}

}
