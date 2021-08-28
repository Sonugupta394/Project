package scripts;


import org.junit.Test;

public class Exception_Test {

	@Test
	public void test() {
		System.out.println(" boolean a = true ");
	}
	
	
	//@Ignore
	@Test
	public void test1()
	{
		System.out.println(" boolean b = false ");
	}
	
	// Exception handling

	@Test(expected=ArithmeticException.class)
	public void exception()
	{
		int a,b,c;
		a=10;
		b=0;
		c=a/b;
		System.out.println("c value = "+ c);		
	}


	@Test(expected=NullPointerException.class)
	public void main1()
	{
		String a = null; 
		System.out.println(a.charAt(0));      
		System.out.println("NullPointerException..");
	}

	@Test(expected=StringIndexOutOfBoundsException.class)
	public  void main2()
	{	     
		String a = "This is like chipping "; 
		char c = a.charAt(24); 
		System.out.println(c);
		System.out.println("StringIndexOutOfBoundsException");	        
	}

	@Test(expected=NumberFormatException.class)
	public void main3()
	{
		int num = Integer.parseInt ("akki") ; 
		System.out.println(num);    
		System.out.println("Number format exception");      
	}

	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public  void main4()
	{
		int a[] = new int[5];
		a[6] = 9; 
		System.out.println ("Array Index is Out Of Bounds");
	}
}


