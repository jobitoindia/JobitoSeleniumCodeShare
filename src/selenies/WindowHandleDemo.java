package selenies;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\softwares\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/popup.php");   
		
		String parentWindow=driver.getWindowHandle();   //stores the ID of current window
		
		WebElement link=driver.findElement(By.xpath("//a[text()='Click Here']"));
		link.click();
		
		Set<String> allwindows=driver.getWindowHandles();   // stores ID of all windows opened by the selenium
		
		for(String childWindow:allwindows)
		{
			
					driver.switchTo().window(childWindow);    // transfer control to new/child windows
					String currentUrl=driver.getCurrentUrl();
					
					if(currentUrl.contains("articles_popup.php")) 
					{
						WebElement emaildFiled =driver.findElement(By.xpath("//input[@name='emailid']"));
						emaildFiled.sendKeys("lahu@gmail.com");
					
						WebElement submitBtn=driver.findElement(By.xpath("//input[@name='btnLogin']"));
						submitBtn.click();
					}
			
		}
		
//		driver.close();  //closes current window
		driver.switchTo().defaultContent();
		driver.quit();  //closed all the winodws opened by the selenium
		
	}

}
