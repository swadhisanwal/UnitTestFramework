package com.unitTestArithmetic.qa.testcases;
import static org.testng.Assert.assertEquals;
import org.apache.log4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.unitTestArithmetic.qa.MathFunctions;


public class DivideFunctionTest {
	MathFunctions checkDividefunction;
	Logger log = Logger.getLogger(MathFunctions.class);

	@BeforeMethod()
	public void setup() {
		checkDividefunction =new MathFunctions();}

	@Test
	public void addTest1(){
		int div =checkDividefunction.divide(2,3);
		log.info(div);
		assertEquals(div,0);
	}

	@Test
	public void addTest2() {
		int div =checkDividefunction.divide(-6,3);
		log.info(div);
		assertEquals(div,-2);
	}

	@Test
	public void addTest3() {
		int div =checkDividefunction.divide(7,-15);
		log.info(div);
		assertEquals(div,0);
	}

	@Test
	public void addTest4() {
		int div =checkDividefunction.divide((2*0),(-15*0));
		log.info(div);
		assertEquals(div,0);
	}

	@Test(expectedExceptions =ArithmeticException.class)
	public void addTest5() {
		int div =checkDividefunction.divide((2/0),(-15));
		log.info(div);
		
	}

	@Test(expectedExceptions =ArithmeticException.class)
	public void addTest6() {
		int div =checkDividefunction.divide((20),(-15/0));
		log.info(div);
		
	}

	@Test(expectedExceptions =ArithmeticException.class)
	public void addTest7() {
		int div =checkDividefunction.divide((20/0),(-15/0));
		log.info(div);
	}
}



