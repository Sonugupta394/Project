package scripts;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

 //@Ignore
public class assert_CalculatorTest {
	
	calculator cal=new calculator();
		
	@Before
	public void before()
	{
		System.out.println("Printed before method");
	}
	
	@After
	public void after()
	{
		System.out.println("Printed after method");
	} 

	@Test
	public void testSub() {
		assertEquals(10 , cal.sub(15,5));
		
		assertTrue(5>2);
		assertFalse(28>30);
		
		assertNotNull("str");
		assertNull(null);		 
					
	}

	@Test
	public void testMul() 
	{				
		assertNotEquals(12 , cal.mul(5,3));
	}
	
	@Test
	public void testAdd() 
	{
		assertSame(30 , cal.add(25,5));		
		assertNotSame(510 , cal.add(45,5));			
	}
	
	@Test
	public void testDiv()
	{
				assertSame(20 , cal.div(200,10));				
				assertNotSame(20 , cal.div(10,2));
	}			
}
