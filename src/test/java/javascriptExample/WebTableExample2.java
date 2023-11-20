package javascriptExample;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//ctrl+shift+O ----- add or remove unused imports

//Generated by Selenium IDE

public class WebTableExample2 {
	private WebDriver driver;

	@Test
	public void recaptest() throws Exception {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		
		
		
		WebElement btn_Submit = driver.findElement(By.cssSelector("button#submit"));
		
		JavascriptExecutor JS = (JavascriptExecutor)driver;
		
		//JS.executeScript("alert('hello everyone, happy learning!!')");
		
		
		
		
		JS.executeScript("arguments[3].click();",btn_Submit, "", "", btn_Submit);
		
		
		
		
		//driver.findElement(By.cssSelector("button#submit")).click();
		
//		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
//		
//		
//		
////		JavaScript example
//	
//		
//		
//		
//		
//		driver.findElement(By.xpath("//td[text()='Helen Bennett']//preceding-sibling::td/input")).click();
		
		
		
		
	}
}
