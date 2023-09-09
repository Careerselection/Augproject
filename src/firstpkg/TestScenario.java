package firstpkg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenario 
{

	@Test(priority=-1)
	public void firsttestcase()
	{
		System.out.println("first test case");
		
		Assert.assertEquals("Hello", "Hello1);"
				
				System.out.println("this is failed");		
				
				
		}
	
	@Test(priority=-2)
	public void secondtestcase()
	{
		System.out.println("second test case");
		}
	
	@Test
	public void thridtestcase()
	{
		System.out.println("thrid test case");
		}
	@Test
	public void foouthtestcase()
	{
		System.out.println("fourth test case");
		}
}
	
			

