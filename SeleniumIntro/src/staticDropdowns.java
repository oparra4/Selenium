import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticDropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/oscar/OneDrive/Documents/SeleniumDrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//dropdown with Select tag
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(3);
		System.out.println (dropdown.getFirstSelectedOption().getText());	
		dropdown.selectByVisibleText("AED");
		System.out.println (dropdown.getFirstSelectedOption().getText());
		
		//Dropdown without Select tag
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(500);
		int i = 1;
		while(i<5) 
		{
			driver.findElement(By.id("hrefIncAdt")).click(); // 2 adults
			i++;
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
			
		driver.quit();

	}

}
