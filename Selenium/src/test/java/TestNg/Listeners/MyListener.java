package TestNg.Listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class MyListener implements IAnnotationTransformer{

	int counter=10;
	
	public void transform(ITestAnnotation testAnnotation, Class testClass, Constructor testConstructor, Method testMethod) {
		// TODO Auto-generated method stub
		
		if (testMethod.getName().equals("ChangeInvocationCountOfMethod")) {
			System.out.println("Changing invocation for the following method: " + testMethod.getName());
			testAnnotation.setInvocationCount(counter);
		
	}
	
		}
	
}


