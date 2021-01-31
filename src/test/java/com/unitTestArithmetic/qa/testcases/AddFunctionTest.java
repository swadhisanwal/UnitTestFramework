package com.unitTestArithmetic.qa.testcases;
import static org.testng.Assert.assertEquals;
import org.apache.log4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.unitTestArithmetic.qa.MathFunctions;

public class AddFunctionTest {

	MathFunctions checkMathfunction;
	Logger log = Logger.getLogger(MathFunctions.class);

	@BeforeMethod()
	public void setup() {
		checkMathfunction =new MathFunctions();}

	@Test
	public void addTest1(){
		int sum =checkMathfunction.add(2,3);
		log.info(sum);
		assertEquals(sum,5);
	}

	@Test
	public void addTest2() {
		int sum =checkMathfunction.add(-2,3);
		log.info(sum);
		assertEquals(sum,1);
	}

	@Test
	public void addTest3() {
		int sum =checkMathfunction.add(7,-15);
		log.info(sum);
		assertEquals(sum,-8);
	}

	@Test
	public void addTest4() {
		int sum =checkMathfunction.add((2*0),(-15*0));
		log.info(sum);
		assertEquals(sum,0);
	}

	@Test(expectedExceptions =ArithmeticException.class)
	public void addTest5() {
		int sum =checkMathfunction.add((2/0),(-15));
		log.info(sum);
	}

	@Test(expectedExceptions =ArithmeticException.class)
	public void addTest6() {
		int sum =checkMathfunction.add((20),(-15/0));
		log.info(sum);
		
	}

	@Test(expectedExceptions =ArithmeticException.class)
	public void addTest7() {
		int sum =checkMathfunction.add((20/0),(-15/0));
		log.info(sum);
		
	}
}


