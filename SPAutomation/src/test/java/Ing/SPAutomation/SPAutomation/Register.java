package Ing.SPAutomation.SPAutomation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Register extends TestBaseClass {

	@Test
	public void Register() {
		System.out.println("Registaration Started");
		StartApplication();

		try {
			getElementByXpath(Objects.getProperty("Reg_FirstName")).sendKeys(Params.getProperty("FN"));
			getElementByXpath(Objects.getProperty("Reg_LastName")).sendKeys(Params.getProperty("LN"));
			getElementByXpath(Objects.getProperty("Reg_Phone")).sendKeys(Params.getProperty("Phone"));
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println("Issue with Registaration " + e.getMessage());
		}

		StopApplication();
	}
	
}
