package actionExample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import org.junit.Test;

public class RightClickTest {

	WebDriver driver;

//	testNG <------ Junit

	@BeforeTest
	public void launchApp() throws Exception {

		System.out.println("launching an app on chrome browser");
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Thread.sleep(4000);

	}

	@AfterTest
	public void closeApp() throws InterruptedException {
		System.out.println("closing an app");
		Thread.sleep(7000);
		driver.close();

	}

	

	@Test
	public void Frame_ControlExample() throws Exception {

		
		Actions act = new Actions(driver);
		
		
		WebElement btn_right = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		
		
		//perform right click operation ----- context click
		//app1
//		act.contextClick(btn_right).perform();
		
		
		
		
		//app2
		act.moveToElement(btn_right).contextClick().perform();
		
		
		

	}
}
