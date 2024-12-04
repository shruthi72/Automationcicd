package Test;

import org.testng.annotations.Test;

public class GroupsUsage {
	
	@Test(enabled=false)
	public void bugtc()
	{
		System.out.println("This TC having Issue so used enabled false to skip this");
	}
	
	@Test(groups= {"ABC"})
	public void regressiontc()
	{
		System.out.println("Usage of Groups TC 3");
	}
	
	@Test
	public void bzxy()
	{
		System.out.println("Method last");
	}
	
	@Test(timeOut=4000)
	public void middle()
	{
		System.out.println("Method middle");
	}
	
	
	@Test(dependsOnMethods= {"bzxy","middle"})
	public void Alphaone()
	{
		System.out.println("Method Aphaone");
	}

}
