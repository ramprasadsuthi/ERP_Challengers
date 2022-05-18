package commonMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BaseMethods {
	
	public WebDriver driver;
	
	public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public void launchERP() {
        driver.get("http://orangehrm.qedgetech.com/webapp/login.php");
		//when there is delay in loading page use wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void loginERP() {
		WebElement username = driver.findElement(By.id("username"));
		username.clear();
		username.sendKeys("admin");
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("master");
		WebElement loginbtn = driver.findElement(By.id("btnsubmit"));
    	loginbtn.click();
	}
    	
    public void loginERP_Param(String uname, String pwd) {
    		WebElement username = driver.findElement(By.id("username"));
    		username.clear();
    		username.sendKeys(uname);
    		WebElement password = driver.findElement(By.id("password"));
    		password.clear();
    		password.sendKeys(pwd);
    		WebElement loginbtn = driver.findElement(By.id("btnsubmit"));
        	loginbtn.click();
    	
    	// put the validation code to check login is success or not
		String pcaption = driver.findElement(By.id("ewPageCaption")).getText();
		Assert.assertEquals(pcaption, "Dashboard");
	//	if (pcaption.equals("Dashboard")) {
	//		System.out.println("Login is success, and Test case is Passed");
	//	} else {
	//		System.out.println("Login failed, and Test case is Failed");
	//	}
	}
	
	public void logoutERP() {
		//click on Logout link
		driver.findElement(By.id("mi_logout")).click();
	   //validate Login button existance
				
		if(driver.findElement(By.id("btnsubmit")).isEnabled()) {
			System.out.println("Logout is success, and Test case is Passed");
		} else {
			System.out.println("Logout is failed, and Test case is Failed");
		  }
	}

}
