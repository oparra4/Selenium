import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class dynamicDropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/oscar/OneDrive/Documents/SeleniumDrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='MAA']")).click();	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='DEL']")).click();	
		//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='DEL']
		Thread.sleep(1000);
		//Select current date on From date picker
		driver.findElement(By.className("ui-state-highlight")).click();
		Thread.sleep(1000);
		//check to see if to date picker is enabled
		//Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			System.out.println("'To' date picker  is enabled");
			Assert.assertTrue(true);
		}else {
			
			Assert.assertTrue(false);
		}
		//Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		
		driver.quit();
	}

}
