package selenies;

import java.io.InputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SeleniumDemo {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub	
		System.setProperty("webdriver.chrome.driver", "E:\\softwares\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		

		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
//		driver.get("https://www.saucedemo.com/");
		driver.navigate().to("https://www.saucedemo.com/");   // open particular site
		
		WebElement un,pass,loginBtn;
		Thread.sleep(3000);
		
		un=driver.findElement(By.xpath("//input[@placeholder='Username']"));  
		//located using multiple attribute
		un.sendKeys("standard_user");
		
		pass=driver.findElement(By.xpath("//input[@id='password']")); //pattern matching: starts_with
		pass.sendKeys("secret_sauce");
		
		loginBtn=driver.findElement(By.cssSelector("input[name$='button']"));   //patterrn matching: emds_with
		loginBtn.click();
		
//		WebElement productLink=driver.findElement(By.linkText("Sauce Labs Backpack"));
		WebElement productLink=driver.findElement(By.partialLinkText("Sauce Labs Backpac"));
		productLink.click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.navigate().back();     // it take back to previous page
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.navigate().forward();  // it take to page which is open after particular click
		driver.navigate().refresh();
		

	}

}
