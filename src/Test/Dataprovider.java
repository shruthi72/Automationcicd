package Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	
	@Test(dataProvider="getData")
	public void webLogin(String name,String pass)
	{
		System.out.println("Weblogin");
		System.out.println(name+"\n"+pass);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		//1st combination - username password with valid
		//2nd - invalid username
		//3rd - invalid password
		//so we need to test 3 different combination which will be as row - [3] and 2 values will be column [2]
		// using above row, column define multi dimensional array object
		Object[][] data=new Object[3][2];
		//array starts with zero

		data[0][0]="User1";
		data[0][1]="Password1"; //1st combination
		
		data[1][0]="User2";
		data[1][1]="Password2"; //2nd combination
		
		data[2][0]="User3";
		data[2][1]="Password3"; //3rd combination
		
		return data;	
		
	}

}
