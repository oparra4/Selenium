import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Invoke browser
		//chromedriver.exe
		
		//Chrome execution
		//System.setProperty("webdriver.chrome.driver", "C:/Users/oscar/OneDrive/Documents/SeleniumDrivers/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		//firefox execution on geckodriver
		//System.setProperty("webdriver.chrome.driver", "C:/Users/oscar/OneDrive/Documents/SeleniumDrivers/geckodriver.exe");
	    //WebDriver driver = new FirefoxDriver();
		
		//Edge execution on msedge
		System.setProperty("webdriver.chrome.driver", "C:/Users/oscar/OneDrive/Documents/SeleniumDrivers/msedgedriver.exe");
	    WebDriver driver = new EdgeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/");
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());
		System.out.println(16>>>3);
		
		driver.quit();
		
		

	}

}
