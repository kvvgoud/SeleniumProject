package junitPrograms;

import org.junit.*;

public class SecondJUnitTestCase {

	@Before
	public void setUp() throws Exception {
		System.out.println("\n\t Before Method: ");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("\n\t After Method:  ");
	}

	@Test
	public void test1() {
		
		System.out.println("\n\t Test1(): ");
		
	}
	
	@Test
	public void test2() {
		System.out.println("\n\t Test2(): ");
	}
	
	@Test
	void test3() {
		System.out.println("\n\t Test3(): ");
	}
	
	@Test
	void test4() {
		System.out.println("\n\t Test4(): ");
	}
	
	@Test
	void test5() {
		System.out.println("\n\t Test5(): ");
	}

}
