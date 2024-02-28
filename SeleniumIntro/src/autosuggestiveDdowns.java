import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
public class autosuggestiveDdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/oscar/OneDrive/Documents/SeleniumDrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(1000);
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for(WebElement option: options) {
			if (option.getText().equalsIgnoreCase("India")){
				option.click();
				break;
			}
		}
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input[id*= 'friendsandfamily']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*= 'friendsandfamily']")).isSelected());
		//System.out.println (driver.findElement(By.cssSelector("input[id*= 'friendsandfamily']")).isSelected());
		
		System.out.println (driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"1 Adult");
		//System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.id("divpaxinfo")).click();
		for(int i = 0; i<5;i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
			}
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"6 Adult");
		//System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.quit();

	}

}
