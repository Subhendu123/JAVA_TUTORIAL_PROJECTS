package myproject.exception_pkg;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Operation {
	
	public static int divisionMethod(int a,int b) throws NullPointerException/*IOException,FileNotFoundException,Exception,ArithmeticException*/{
		return a/b;
	}
}
