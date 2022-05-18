package automationPrograms;

import commonMethods.BaseMethods;

public class LoginByUsingMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BaseMethods base = new BaseMethods();
		base.openBrowser();
		base.launchERP();
		base.loginERP();
	}
}
