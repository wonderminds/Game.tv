package org.gametv.base;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.*;
import io.appium.java_client.remote.MobileCapabilityType;

public class Sample {
	
	static AppiumDriver<MobileElement> driver;
    @BeforeTest
	public static void setup() throws MalformedURLException {
	
	DesiredCapabilities cap = new DesiredCapabilities();
    cap.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
    cap.setCapability("DeviceName", "Oneplus 5T");
    cap.setCapability(MobileCapabilityType.UDID,"a3791060");
    cap.setCapability(CapabilityType.VERSION,"10.0.1");
    cap.setCapability("platformName", "Android");
    cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,60);
    cap.setCapability("appPackage","io.selendroid.testmap");
    cap.setCapability("appActivity","HomeScreenActivity");

     URL url = new URL("http://127.0.0.1:4727/wd/hub");
     driver = new AppiumDriver<MobileElement>(url,cap);
     driver = new AndroidDriver<MobileElement>(url,cap);
    
     
    
 }
    @AfterTest
    public  void teardown() {
   	System.out.println("We are releasing the occupied resources here");
   	 
    }
    
    @Test
    public void run() {
    	try {
			Sample.setup();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	System.out.println("Here we are running the browser on mobile device.");
    }

}
	
	

