package testNG_Scripts;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Test1 {
  @Test(dataProvider = "dp")
  public void TC1(String username, String password) {
	  System.out.print("User Name is " + username);
	  System.out.println(" and  ---> Password is  " + password);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "admin", "master" },
      new Object[] { "root", "casino" },
      new Object[] { "tiger", "oracle" },
    };
  }
}
