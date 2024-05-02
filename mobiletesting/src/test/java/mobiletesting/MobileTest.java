package mobiletesting;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
public class MobileTest {
	static AndroidDriver<MobileElement> driver;
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities capabalities=new DesiredCapabilities();
		 capabalities.setCapability("deviceName", "emulator-5554");
		 capabalities.setCapability("platformName", "Andriod");
		 capabalities.setCapability("platformversion", "9");
		 capabalities.setCapability("appPackage", "com.android.calculator2");
		 capabalities.setCapability("appActivity", "com.android.calculator2.Calculator");
		 driver=new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),capabalities);
		
		 driver.findElement(By.id("com.android.calculator2:id/digit_9")).click();
		 driver.findElement(By.id("com.android.calculator2:id/op_mul")).click();
		 driver.findElement(By.id("com.android.calculator2:id/digit_5")).click();
		 driver.findElement(By.id("com.android.calculator2:id/eq")).click();
		 
	}

}
