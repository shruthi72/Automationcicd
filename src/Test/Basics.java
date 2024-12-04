package Test;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Basics {
	//In SIngle Class you can have multiple test cases like below
	@AfterClass
	public void classafter()
	{
		System.out.println("After Class Annotation");
	}
	@AfterMethod
	public void methafter()
	{
		System.out.println("After Method Annotation");
	}
	@AfterTest
	public void lastexecution()
	{
		System.out.println("After Test Annotation");
	}
	@AfterSuite
	public void finalone()
	{
		System.out.println("After Suite Annotation");
	}
	@Parameters({"ONE"})
	@Test
	public void print(String param)
	{
		System.out.println("Hello");
		System.out.println(param);
	}
	
	@Test
	public void SecondTestCase()
	{
		System.out.println("Bye");
	}
	
	@Test(groups= {"ABC"})
	public void regressiontc()
	{
		System.out.println("Usage of Groups TC 1");
		//Assert.assertTrue(false); // using this line for checking failure message in listeners
	}
	

}
