package Ing.SPAutomation.SPAutomation;

import org.testng.annotations.Test;

public class SignOn extends TestBaseClass {
  @Test
  public void SignOn() {
  StartApplication();
  try{
		getElementByLink(Objects.getProperty("SignOn")).click();
Thread.sleep(2000);
}
catch(Exception e)
{
	System.out.println("issue in SignOn Test Cases"+e.getMessage());
	
}
StopApplication();
  }
}
