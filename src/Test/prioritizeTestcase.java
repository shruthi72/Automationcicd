package Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class prioritizeTestcase {
	@Parameters({"URL","API"})
	@Test
	public void webloginLoan(String urlname, String key)
	{
		//Selenium
		System.out.println("webloginLoan");
		System.out.println(urlname);
		System.out.println(key);
	}
	
	@Test
	public void mobilelogin()
	{
		System.out.println("mobileloginLoan");
	}
	
	@Test
	public void mobilesignout()
	{
		System.out.println("mobilesignout");
	}
	
	@Test
	public void loginAPI()
	{
		System.out.println("APIloginLoan");
	}
	
	@BeforeTest
	public void prereq()
	{
		System.out.println("Before Test Annotation");
	}
	
	@BeforeSuite
	public void firstone()
	{
		System.out.println("Before Suite Annotation");
	}
	
	@BeforeMethod
	public void methodann()
	{
		System.out.println("Before Method Annotation");
	}
	
	@BeforeClass
	public void classbef()
	{
		System.out.println("Before Class Annotation");
	}
	
	@Test(groups= {"ABC"})
	public void regressiontc()
	{
		System.out.println("Usage of Groups TC 2");
	}
	

}
