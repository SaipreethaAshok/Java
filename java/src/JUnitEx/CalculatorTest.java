package JUnitEx;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class CalculatorTest {
   static Calculator c;
   @BeforeEach
   void setup()
   {
	   System.out.println("In Setup");
	   c=new Calculator();
   }
	@Test
	void addtest()
	{
		assertEquals(12,c.add(5, 7));
	}
	@Test
	void areatest() {
		assertEquals(25*Math.PI,c.area(5));
	}
}
