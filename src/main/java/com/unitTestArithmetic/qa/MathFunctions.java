package com.unitTestArithmetic.qa;

public class MathFunctions {
	
	public int add(int  num1, int num2)
	{
		int num3= num1 + num2;
		return num3;

	}
	
	public int multiply(int  num1, int num2) {
		int result = num1*num2;
		return result;
		
	}
	
	public int subtract(int num1, int num2)
	{
		int result = num1-num2;
		return result;
		
	}
	public int divide(int num1,int num2) {
		int result = 0;
		try{

		result= num1/num2;}
		catch (ArithmeticException e)
		{
		System.out.println("Can't be divided by zero");
		}
		return result;
	}
	
	


}
