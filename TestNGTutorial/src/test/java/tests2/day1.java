package tests2;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {
	
	@Test
	@Parameters({"browser"})
	public void demo(String broser) {
		System.out.println("Hello Automation test 2pakg"+broser);
		
	}
	
	@Test
	public void secondTest() {
		System.out.println("Running second test");
	}

}
