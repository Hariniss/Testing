package org.inmakestest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class FristTest {

	public static AndroidDriver driver;

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "11");
		cap.setCapability("deviceName", "princess");
		cap.setCapability("udid", "084113129P075734");
		cap.setCapability("appPackage", "Name: Calculator\r\n");
		cap.setCapability("appActivity", "com.transsion.calculator.Calculator");

		URL url = new URL("https://0.0.0.0:4723/wd/hub");
		driver = new AndroidDriver(url, cap);

	}

}
