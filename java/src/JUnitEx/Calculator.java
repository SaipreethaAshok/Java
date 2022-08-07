package JUnitEx;

public class Calculator {
	Calculator calculatorservice;
 int add(int num1,int num2)
 {
	 return calculatorservice.add(num1,num2);
 }

float area(int radius) {
	
	return (float) (Math.PI*radius*radius);
}
int perform(int num1,int num2)
{
	return calculatorservice.add(
			calculatorservice.add(num1,num2)*5,num1);
}
}
