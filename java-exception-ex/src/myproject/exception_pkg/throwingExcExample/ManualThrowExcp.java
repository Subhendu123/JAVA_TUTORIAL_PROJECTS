package myproject.exception_pkg.throwingExcExample;

import java.io.IOException;

public class ManualThrowExcp {
	
	public static class InnerManualThrowExcp{
		public int isAccessible(int a,int b) throws IOException /*throws NullPointerException*/ {
			
			if(a!=b)
				return 1;
			else {
				try {
					return a/b;
				}catch(ArithmeticException ae) {
					System.out.println(ae.getMessage());
					throw new IOException();
					//return 0; unreachable code
				}catch(NullPointerException ne) {
					System.out.println(ne.getMessage());
					throw new NullPointerException();// or return someInt VALUE
				}
			}
		}
	}
	
	

}
