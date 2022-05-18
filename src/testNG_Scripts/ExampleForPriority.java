package testNG_Scripts;

import org.testng.annotations.Test;

public class ExampleForPriority {
  @Test (priority = 0, groups = "login")
  public void a() {
	  System.out.println("Test Case A");
  }
  @Test (priority = 1, groups = "home page")
  public void b() {
	  System.out.println("Test Case B");
  }
  @Test (priority = 2, groups = "login")
  public void d() {
	  System.out.println("Test Case D");
  }
  @Test (priority = 3, groups = "home page")
  public void c() {
	  System.out.println("Test Case C");
  }
}
