package scripts;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class calculator {	
	public int sub(int a, int b)
	{
		return a-b;
	}
	public int mul(int a, int b)
	{
		return a*b;
	}
	public int add(int a, int b) 
	{
	return a+b;
	}
		
	
	@Test
	public int div(int a, int b)
	{
		return a/b;		
	}
	

}
