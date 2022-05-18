package testNG_Scripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import commonMethods.BaseMethods;

public class HomePageModule {
	
  BaseMethods base;
	
  @BeforeMethod
  public void LaunchApplication() {
	  base = new BaseMethods();
	  base.openBrowser();
	  base.launchERP();
	  base.loginERP();
  }
  
  @AfterMethod
  public void CloseApplication() {
	  base.driver.close();
  }
	
  @Test
  public void TC5_Verify_admin_user_is_able_to_access_StockItems_Page() {
	  //click on the stock Items menu 
      base.driver.findElement(By.xpath("//li[@id='mi_a_stock_items']")).click();
     // put the validation code to check stock Items page is opened or not
   	  String pcaption = base.driver.findElement(By.id("ewPageCaption")).getText();
   	  Assert.assertEquals(pcaption , "Stock Items");
  }
  
  @Test
  public void TC6_Verify_admin_user_is_able_to_access_Customers_Page() {
	  base.driver.findElement(By.id("mi_a_customers")).click();
	  String pageName = base.driver.findElement(By.id("ewPageCaption")).getText();
	  Assert.assertEquals(pageName , "Customers");
  }

}
