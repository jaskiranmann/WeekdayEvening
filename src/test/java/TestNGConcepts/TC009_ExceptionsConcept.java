package TestNGConcepts;

import java.lang.reflect.Array;

import org.testng.annotations.Test;

public class TC009_ExceptionsConcept {
	
	
	
//	@Test(expectedExceptions = ArithmeticException.class)
//	public void arithmaticOperation() {
//		
//		System.out.println("Beginning of test");
//		int a = 9/0;
//		
//		System.out.println("End of test");
//	}
	
//	@Test(expectedExceptions = NullPointerException.class)
//	public void arithmaticOperation1() {
//		
//		System.out.println("Beginning of test1");
//		int a = 9/0;
//		
//		System.out.println("End of test1");
//	}
	
//	@Test(expectedExceptions = Exception.class)
//	public void arithmaticOperation2() {
//		
//		System.out.println("Beginning of test");
//		int a = 9/0;
//		
//		System.out.println("End of test");
//	}
	
//	@Test(expectedExceptions = Throwable.class)
//	public void arithmaticOperation3() {
//		
//		System.out.println("Beginning of test");
//		int a = 9/0;
//		
//		System.out.println("End of test");
//	}
	
	@Test(expectedExceptions = {ArithmeticException.class, ArrayIndexOutOfBoundsException.class, NullPointerException.class })
	public void exceptionTest() {
		int a = 9/0;
		
		int b[]= new int[3];
	  b[1] = 4;
	  b[2]=6;
	  b[8]=9;
		
	}

}
