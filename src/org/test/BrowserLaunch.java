package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserLaunch {
	public static void main(String[] args) {
		
		// 1.Browser Launch
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\kalai\\eclipse-workspace\\ProjectSelenium\\Drivers\\msedgedriver.exe");
	//	WebDriver driver=new WebDriver(); ---->Interface
		
		WebDriver driver=new EdgeDriver();

		// 2.Url Launch
		
		driver.get("https://www.facebook.com/");
		
		//get Current title
		
		String title = driver.getTitle();
		System.out.println(title);
		
		//get current url
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		//close
		driver.quit();
		
		System.out.println("hi");
	}
}
