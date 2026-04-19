package selenies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\softwares\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		

		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/test/guru99home/");// open particular site
		
		WebElement myFrame=driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));

//		driver.switchTo().frame("a077aa5e");
//		driver.switchTo().frame(1);
		driver.switchTo().frame(myFrame);
		WebElement banner=driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		banner.click();
	}

}
