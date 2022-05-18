package testNG_Scripts;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Test2 {
  @Test(invocationCount = 10)
  public void TC1() {
	  System.out.println("Number is " + "Admin");
	  System.out.println("Name is   " + "Master");
  }

}
