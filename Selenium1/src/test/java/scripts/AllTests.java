package scripts;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AssertTest.class, assert_CalculatorTest.class, Exception_Test.class })
public class AllTests {

}
