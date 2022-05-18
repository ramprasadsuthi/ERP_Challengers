package automationPrograms;

import org.openqa.selenium.By;

import commonMethods.BaseMethods;

public class TC4_RESET {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BaseMethods base = new BaseMethods();
		base.openBrowser();
		base.launchERP();
		base.driver.findElement(By.xpath("//button[@id='btnreset']")).click();
		
		String uname = base.driver.findElement(By.xpath("//input[@id='username']")).getAttribute("value");
		String password = base.driver.findElement(By.xpath("//input[@id='password']")).getAttribute("value");
		
		if(uname.isEmpty() && password.isEmpty()) {
			System.out.println("RESET is working, Testcase passed");
		} else {
			System.out.println("RESET is not working, Testcase failed");
		}
	}
}
