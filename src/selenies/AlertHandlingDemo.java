package selenies;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandlingDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\softwares\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		

		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/test/delete_customer.php");   // open particular site
		
		WebElement custTextField=driver.findElement(By.xpath("//input[@name='cusid']"));
		
		custTextField.sendKeys("53290");
		
		WebElement submitBtn=driver.findElement(By.xpath("//input[@name='submit']"));
		submitBtn.click();
		
		Alert alert=driver.switchTo().alert();
		
		Thread.sleep(3000);
		
//		alert.accept();   //click on OK/Yes
//		alert.dismiss();  // Click on cancel
//		alert.sendKeys("hi");   //if textFeilf present on Alert
		System.out.println(alert.getText());   //to get the text present on Alert

	}

}
