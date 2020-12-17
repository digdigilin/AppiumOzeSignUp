package tests;

import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
//import io.appium.java_client.android.Activity;

public class SetUp extends SignUp {
	
	@Test(priority=13)
	public void nullFNameTest() throws InterruptedException {
		
		//driver.startActivity(new Activity("com.daretoinnovate.oze", "com.daretoinnovate.oze.presentation.ftue.TutorialsActivity"));
		
		driver.findElementById("com.daretoinnovate.oze:id/call_to_login").click();
		Thread.sleep(4000);
		driver.findElementById("com.daretoinnovate.oze:id/phone_number").sendKeys("209859591");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/edit_text_password").sendKeys("Pass@123");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/btn_login").click();
		Thread.sleep(5000);
		
		System.out.println("Starting test for blank First Name...");
		driver.findElementById("com.daretoinnovate.oze:id/first_name").sendKeys("");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/last_name").sendKeys("Last Name");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/reference_selector").click();
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]").click();
		
		driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().resourceId(\"com.daretoinnovate.oze:id/action_bar_root\")).getChildByText("
				+ "new UiSelector().className(\"android.widget.Button\"), \"Next\")")).click();
		
		String xmlFormat = driver.getPageSource();
		if(xmlFormat.contains("First Name field should not be empty!"))
		{
			System.out.println("Test Passed...");
		}
		
	}
		
		
	@Test(priority=14)
	public void nullLNameTest() throws InterruptedException {
		
		System.out.println("Starting test for blank Last Name...");
		
		driver.findElementById("com.daretoinnovate.oze:id/first_name").sendKeys("a thousand word to check a thousand word to check a thousand word to check a thousand word to check a thousand word to check a thousand word to check a thousand word to check a thousand word to check a thousand word to check a thousand word to check a thousand word to check a thousand word to check a thousand word to check a thousand word to check a thousand word to check a thousand word to check a thousand word to check a thousand word to check a thousand word to check a thousand word to check a thousand word to check a thousand word to check a thousand word to check a thousand word to check a thousand word to check a thousand word to check a thousand word to check a thousand word to check a thousand word to check a thousand word to check a thousand word to check a thousand word to check a thousand word to check a thousand word to check a thousand word to check a thousand word to check a thousand word to check a thousand word to check a thousand word to check a thousand word to check a thousand word to checka thousand word to check");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/last_name").sendKeys("");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/reference_selector").click();
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]").click();
		
		driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().resourceId(\"com.daretoinnovate.oze:id/action_bar_root\")).getChildByText("
				+ "new UiSelector().className(\"android.widget.Button\"), \"Next\")")).click();
		
		String xmlFormat = driver.getPageSource();
		if(xmlFormat.contains("Last Name field should not be empty!"))
		{
			System.out.println("Test Passed...");
		}
	
	}
	
	
	@Test(priority=15)
	public void validProfileTest() throws InterruptedException {
		
		System.out.println("Starting test for valid Profile Details...");
		
		driver.findElementById("com.daretoinnovate.oze:id/first_name").sendKeys("First Name");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/last_name").sendKeys("Last name");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/reference_selector").click();
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]").click();
		
		driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().resourceId(\"com.daretoinnovate.oze:id/action_bar_root\")).getChildByText("
				+ "new UiSelector().className(\"android.widget.Button\"), \"Next\")")).click();
		
		String xmlFormat = driver.getPageSource();
		if(xmlFormat.contains(""))
		{
			System.out.println("Test Passed...");
		}
	
	}
	
	
	@Test(priority=16)
	public void nullBNameTest() throws InterruptedException {
		
		System.out.println("Starting test for null Business Name...");
		
		driver.findElementById("com.daretoinnovate.oze:id/business_name").sendKeys("");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/business_industry").click();
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[8]").click();
		driver.findElementById("com.daretoinnovate.oze:id/business_description").sendKeys("Kpakpakpa moves");
		driver.hideKeyboard();
		
		driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().resourceId(\"com.daretoinnovate.oze:id/action_bar_root\")).getChildByText("
				+ "new UiSelector().className(\"android.widget.EditText\"), \"\")")).sendKeys("adenta");
		driver.hideKeyboard();
		
		driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().resourceId(\"com.daretoinnovate.oze:id/action_bar_root\")).getChildByText("
				+ "new UiSelector().className(\"android.widget.Button\"), \"Next\")")).click();
		
		String xmlFormat = driver.getPageSource();
		if(xmlFormat.contains("Business field cannot be empty"))
		{
			System.out.println("Test Passed...");
		}
	
	}
	
	
	@Test(priority=17)
	public void nullBDescTest() throws InterruptedException {
		
		System.out.println("Starting test for null Business Description...");
		
		driver.findElementById("com.daretoinnovate.oze:id/business_name").sendKeys("Xhibit Slyde");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/business_industry").click();
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[8]").click();
		driver.findElementById("com.daretoinnovate.oze:id/business_description").sendKeys("");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/add_business_location").clear();
		driver.findElementById("com.daretoinnovate.oze:id/add_business_location").sendKeys("adenta");
		driver.hideKeyboard();
		
		driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().resourceId(\"com.daretoinnovate.oze:id/action_bar_root\")).getChildByText("
				+ "new UiSelector().className(\"android.widget.Button\"), \"Next\")")).click();
		
		String xmlFormat = driver.getPageSource();
		if(xmlFormat.contains("Business description Should not be empty"))
		{
			System.out.println("Test Passed...");
		}
	
	}
	
	
	@Test(priority=18)
	public void nullBLocTest() throws InterruptedException {
		
		System.out.println("Starting test for null Business Location...");
		
		driver.findElementById("com.daretoinnovate.oze:id/business_name").sendKeys("Xhibit Slyde");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/business_industry").click();
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[8]").click();
		driver.findElementById("com.daretoinnovate.oze:id/business_description").sendKeys("Kpakpakpa moves");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/add_business_location").clear();
		driver.hideKeyboard();
		
		driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().resourceId(\"com.daretoinnovate.oze:id/action_bar_root\")).getChildByText("
				+ "new UiSelector().className(\"android.widget.Button\"), \"Next\")")).click();
		
		String xmlFormat = driver.getPageSource();
		if(xmlFormat.contains("Location field cannot be empty"))
		{
			System.out.println("Test Passed...");
		}
	
	}
	

	@Test(priority=19)
	public void valBSetupTest() throws InterruptedException {
		
		System.out.println("Starting test for valid Business Details...");
		
		driver.findElementById("com.daretoinnovate.oze:id/business_name").sendKeys("Xhibit Slyde");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/business_industry").click();
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[8]").click();
		driver.findElementById("com.daretoinnovate.oze:id/business_description").sendKeys("Kpakpakpa moves");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/add_business_location").clear();
		driver.findElementById("com.daretoinnovate.oze:id/add_business_location").sendKeys("adenta");
		driver.hideKeyboard();
		
		driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().resourceId(\"com.daretoinnovate.oze:id/action_bar_root\")).getChildByText("
				+ "new UiSelector().className(\"android.widget.Button\"), \"Next\")")).click();
		
		String xmlFormat = driver.getPageSource();
		if(xmlFormat.contains(""))
		{
			System.out.println("Test Passed...");
		}
	
	}
	
	
	@Test(priority=20)
	public void valWalletTest() throws InterruptedException {
		
		System.out.println("Starting test for valid Wallet Details...");
		
		driver.findElementById("com.daretoinnovate.oze:id/goal_selector").click();
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[4]").click();
		driver.findElementById("com.daretoinnovate.oze:id/currency_selector").click();
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]").click();
		
		driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().resourceId(\"com.daretoinnovate.oze:id/action_bar_root\")).getChildByText("
				+ "new UiSelector().className(\"android.widget.EditText\"), \"\")")).sendKeys("500");
		driver.hideKeyboard();
		
		driver.findElementById("com.daretoinnovate.oze:id/save_wallet").click();
		
		
		String xmlFormat = driver.getPageSource();
		if(xmlFormat.contains(""))
		{
			System.out.println("Test Passed...");
		}
	
	}
}
