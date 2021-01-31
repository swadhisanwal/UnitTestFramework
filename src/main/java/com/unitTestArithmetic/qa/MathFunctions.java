package com.unitTestArithmetic.qa;

import org.apache.log4j.Logger;

public class MathFunctions {
	Logger log = Logger.getLogger(MathFunctions.class);
	
	public  int add(int  num1, int num2)
	{
		int result=0;
		try{
		result = num1 + num2;
		}
		catch (ArithmeticException e) {
			
			log.info("Divide by zero gives infinity as result");
		}
		return result;

	}
	
	public  int multiply(int  num1, int num2) {
		return (num1*num2);
		
		
	}
	
	public  int subtract(int num1, int num2)
	{
		return(num1-num2);
		
		
	}
	public  int divide(int num1,int num2) {
		int result = 0;
		try{

		return( num1/num2);}
		catch (ArithmeticException e)
		{
		log.info("Divide by zero gives infinity as result");
		}
		return result;
	}
	
	


}
