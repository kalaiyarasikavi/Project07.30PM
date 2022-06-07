package org.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Locator {
	public static void main(String[] args) {
		//1.Browser Launch
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kalai\\eclipse-workspace\\ProjectSelenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//2.Url Launch
		driver.get("https://www.facebook.com/");
		//By using id
		
	//	By id = By.id("email");
		
		WebElement txtUsername = driver.findElement(By.id("email"));
		txtUsername.sendKeys("kalai.g@gmail.com");
		
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys("1234");
		
		WebElement btnLogin = driver.findElement(By.id("u_0_d_mB"));
		btnLogin.click();
		
		
		//By using name
		
//		WebElement txtUsername = driver.findElement(By.name("email"));
//		txtUsername.sendKeys("kalai");
//		
//		WebElement txtPassword = driver.findElement(By.name("pass"));
//		txtPassword.sendKeys("1234"); //it is used to fill the values in textbox
//		
//		WebElement btnLogin = driver.findElement(By.name("login"));
//		btnLogin.click();//click is used to click the buttons,links,image,radiobutton,checkbox
	}
}
