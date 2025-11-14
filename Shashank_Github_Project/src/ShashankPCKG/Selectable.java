package ShashankPCKG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Selectable {
	public WebDriver driver;
  
	@BeforeTest
	  public void beforeTest() throws InterruptedException {
		WebDriver driver;
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	  }
	
	@Test
  public void f() {
		
		
		driver.switchTo().frame(0); //need to switch to this frame before clicking the slider
			
		Actions action=new Actions(driver);
		action.keyDown(Keys.CONTROL).build().perform();
		driver.findElement(By.xpath(".//*[@id='selectable']/li[1]")).click();
		driver.findElement(By.xpath(".//*[@id='selectable']/li[2]")).click();
		driver.findElement(By.xpath(".//*[@id='selectable']/li[3]")).click();
		action.keyUp(Keys.CONTROL).build().perform();

				
  }
  

  @AfterTest
  public void afterTest() {
  }

}
