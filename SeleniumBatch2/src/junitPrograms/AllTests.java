package junitPrograms;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	
	FaceBookLoginPage_JUnit.class, 
	FBJunitClass.class, 
	Mouseactions.class, 
	SampleJUnitTestCase.class,
	SecondJUnitTestCase.class 
	
})
public class AllTests {

}
