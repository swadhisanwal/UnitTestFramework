package com.unitTestArithmetic.qa.testcases;

import static org.testng.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.unitTestArithmetic.qa.MathFunctions;

public class SubtractFunctionTest {
	
	MathFunctions checkSubtractfunction;
	Logger log = Logger.getLogger(MathFunctions.class);

	@BeforeMethod()
	public void setup() {
		checkSubtractfunction =new MathFunctions();}

	@Test
	public void addTest1(){
		int sub =checkSubtractfunction.subtract(5,3);
		log.info(sub);
		assertEquals(sub,2);
	}

	@Test
	public void addTest2() {
		int sub =checkSubtractfunction.subtract(-2,3);
		log.info(sub);
		assertEquals(sub,-5);
	}

	@Test
	public void addTest3() {
		int sub =checkSubtractfunction.subtract(7,-15);
		log.info(sub);
		assertEquals(sub,22);
	}

	@Test
	public void addTest4() {
		int sub =checkSubtractfunction.subtract((2*0),(-15*0));
		log.info(sub);
		assertEquals(sub,0);
	}

	@Test(expectedExceptions =ArithmeticException.class)
	public void addTest5() {
		int sub =checkSubtractfunction.subtract((2/0),(-15));
		log.info(sub);
	}

	@Test(expectedExceptions =ArithmeticException.class)
	public void addTest6() {
		int sub =checkSubtractfunction.subtract((20),(-15/0));
		log.info(sub);
		
	}

	@Test(expectedExceptions =ArithmeticException.class)
	public void addTest7() {
		int sub =checkSubtractfunction.subtract((20/0),(-15/0));
		log.info(sub);
		
	}
}

