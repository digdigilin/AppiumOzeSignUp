package tests;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	
AndroidDriver<MobileElement> driver;
	
	@BeforeClass
	public void setup() {
		
		try {
		
			DesiredCapabilities cap = new DesiredCapabilities();
		
			cap.setCapability("deviceName", "SM-A260F");
			cap.setCapability("udid", "3801fdd5d40b36b5");
			cap.setCapability("platformName", "Android");
			cap.setCapability("platformVersion", "8.1.0");
			cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 30);
		
			cap.setCapability("appPackage", "com.daretoinnovate.oze");
			cap.setCapability("appActivity", "com.daretoinnovate.oze.presentation.ftue.TutorialsActivity");
		
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
			driver = new AndroidDriver<MobileElement>(url, cap);
		}catch(Exception e) {
			System.out.println("Cause is: "+e.getCause());
		}
	}
	
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}


}
