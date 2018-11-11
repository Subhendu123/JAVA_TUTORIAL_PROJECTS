package myproject.exception_pkg;

import java.io.FileNotFoundException;
import java.io.IOException;

import myproject.exception_pkg.throwingExcExample.ManualThrowExcp;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Operation.divisionMethod(20, 0);
			ManualThrowExcp.InnerManualThrowExcp innerClssObject = new ManualThrowExcp.InnerManualThrowExcp();
			//try
			innerClssObject.isAccessible(2, 0);
		}/*catch(FileNotFoundException | ArithmeticException e) {
			e.printStackTrace();
		}*/catch (NullPointerException e) {
			// TODO Auto-generated catch block
			System.out.println("Caught the exception "+e.getMessage());
			e.printStackTrace();
		}catch(IOException ie) {
			System.out.println(ie.getMessage());
		}
			/* catch (Exception e) {
		}
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		Operation.divisionMethod(20, 0);
		
	}

}
