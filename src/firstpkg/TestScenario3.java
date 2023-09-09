package firstpkg;

import org.testng.annotations.Test;

public class TestScenario3 
{

	@Test(priority=-1)
	public void firsttestcase()
	{
		System.out.println("first test case");
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
	
			

