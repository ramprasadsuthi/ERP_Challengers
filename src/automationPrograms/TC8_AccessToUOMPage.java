package automationPrograms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import commonMethods.BaseMethods;

public class TC8_AccessToUOMPage {
	public static void main(String[] args) {
		// Access to the Access To Unit of Measurements Page
	
		BaseMethods base = new BaseMethods();
		base.openBrowser();
		base.launchERP();
		base.loginERP();
		
        WebElement stockItems = base.driver.findElement(By.id("mi_a_stock_items"));
		
		Actions actions = new Actions(base.driver);
		actions.moveToElement(stockItems).build().perform();
		
		WebElement uom = base.driver.findElement(By.id("mi_a_unit_of_measurement"));
		actions.moveToElement(uom).build().perform();
		uom.click();
		
		String pageName = base.driver.findElement(By.id("ewPageCaption")).getText();
		if(pageName.equals("Unit of Measurement")) {
			System.out.println("Unit of Measurement page is displayed.. Testcase is passed");
		} else {
			System.out.println("Testcase is Failed..");
		}

	}

}
