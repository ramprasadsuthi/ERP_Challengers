package testNG_Scripts;

import org.testng.annotations.Test;

import commonMethods.BaseMethods;

import org.testng.annotations.Parameters;

public class LoginWithParameters {
	
	@Parameters({ "username", "password" })
	@Test
	public void testCaseTwo(String username, String password) {
		
		BaseMethods base = new BaseMethods();
		base.openBrowser();
		base.launchERP();
		base.loginERP_Param(username, password);
		
	}
}
