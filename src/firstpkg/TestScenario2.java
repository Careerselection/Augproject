package firstpkg;

import org.testng.annotations.Test;

public class TestScenario2 
{

	@Test
	public void firsttestcase()
	{
		System.out.println("first test case");
		}
	
	@Test(enabled=false)
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
	
			

