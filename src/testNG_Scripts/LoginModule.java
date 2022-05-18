package testNG_Scripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import commonMethods.BaseMethods;

public class LoginModule {
	
  BaseMethods base;
	
  @BeforeMethod
  public void LaunchApplication() {
	  base = new BaseMethods();
	  base.openBrowser();
	  base.launchERP();
  }
  
  @AfterMethod
  public void CloseApplication() {
	  base.driver.close();
  }
	
  @Test
  public void TC1_Verify_admin_user_is_able_to_loginWith_valid_credentials() {
	  base.loginERP();
  }
  
  @Test
  public void TC2_Verify_admin_user_is_able_to_Logout_ERP_Application() {
	  base.loginERP();
	  base.logoutERP();
  }

}
