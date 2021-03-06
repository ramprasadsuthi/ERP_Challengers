package automationPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1_ValidLogin {

	public static void main(String[] args) {
		// This testcase related Login to the ERP Application
		// This comment is added from GITHUB Server
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://orangehrm.qedgetech.com/webapp/login.php");
		
		//when there is delay in loading page use wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement username = driver.findElement(By.id("username"));
		username.clear();
		username.sendKeys("admin");
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("master");
		WebElement loginbtn = driver.findElement(By.id("btnsubmit"));
    	loginbtn.click();
    	
    	// put the validation code to check login is success or not
		String pcaption = driver.findElement(By.id("ewPageCaption")).getText();
		if (pcaption.equals("Dashboard")) {
			System.out.println("Login is success, and Test case is Passed");
		} else {
			System.out.println("Login failed, and Test case is Failed");
		}

	}

}
