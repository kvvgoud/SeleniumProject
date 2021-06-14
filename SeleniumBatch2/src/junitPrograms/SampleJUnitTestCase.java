package junitPrograms;

import org.junit.Test;

public class SampleJUnitTestCase extends Base{

	@Test
	public void test() throws Exception {
		
		driver.get("https://www.softwaretestingmaterial.com/entry-and-exit-criteria/");
		Thread.sleep(5000);
	}

}
