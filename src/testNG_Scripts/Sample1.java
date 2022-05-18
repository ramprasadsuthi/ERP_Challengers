package testNG_Scripts;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample1 {

  @BeforeMethod
  public void loginERP() {
	  System.out.println("This method will execute before every test case ..");
  }
  
  @AfterMethod
  public void CloseERP() {
	  System.out.println("This method will execute after every test case ..");
  }
	
  @Test
  public void TestCase_1_addition() {
	  
	  int a,b,sum;
	  a=30; b=30;
	  sum = a+b; 
	  Assert.assertEquals(sum,60,"The calcucation is wrong, testcase failed");
	  System.out.println("The calucation is correct and sum is :" + sum);
	  
  }
  
  @Test
  public void TestCase_2() {
	  System.out.println("Hello, this is my second testcase in TestNG..");
  }
  
  @Test
  public void TestCase_3() {
	  System.out.println("Hello, this is my third testcaes in TestNG..");
  }
  
}
