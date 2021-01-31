package com.unitTestArithmetic.qa.testcases;

import static org.testng.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.unitTestArithmetic.qa.MathFunctions;

public class MultiplyFunctionTest {
	MathFunctions checkMultiplyfunction;
	Logger log = Logger.getLogger(MathFunctions.class);

	@BeforeMethod()
	public void setup() {
		checkMultiplyfunction =new MathFunctions();}

	@Test
	public void addTest1(){
		int mul =checkMultiplyfunction.multiply(2,3);
		log.info(mul);
		assertEquals(mul,6);
	}

	@Test
	public void addTest2() {
		int mul =checkMultiplyfunction.multiply(-6,3);
		log.info(mul);
		assertEquals(mul,-18);
	}

	@Test
	public void addTest3() {
		int mul =checkMultiplyfunction.multiply(-7,-15);
		log.info(mul);
		assertEquals(mul,105);
	}

	@Test
	public void addTest4() {
		int mul =checkMultiplyfunction.multiply((2*0),(-15*0));
		log.info(mul);
		assertEquals(mul,0);
	}

	@Test(expectedExceptions =ArithmeticException.class)
	public void addTest5() {
		int mul =checkMultiplyfunction.multiply((2/0),(-15));
		log.info(mul);
	}

	
}

