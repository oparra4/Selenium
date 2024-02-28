import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class locators {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:/Users/oscar/OneDrive/Documents/SeleniumDrivers/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		//firefox execution on geckodriver
		//System.setProperty("webdriver.chrome.driver", "C:/Users/oscar/OneDrive/Documents/SeleniumDrivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//Implicit waits
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		driver.findElement(By.className("signInBtn")).click();
		//Thread.sleep(2000);
		System.out.println( driver.findElement(By.cssSelector("p.error")).getText());
		
		//forgot password
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("OscarP");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("OscarP@tester.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("12345678");
		//driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		//driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("123485");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("844225555");
		Thread.sleep(500);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		Thread.sleep(500);
		String password = getPassword(driver);
		System.out.println(driver.findElement(By.className("infoMsg")).getText());
		driver.findElement(By.className("go-to-login-btn")).click();
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("rahul");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
		Thread.sleep(500);
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		
		driver.quit();

	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException {
		
		//driver.get("https://rahulshettyacademy.com/locatorspractice/");
		//driver.findElement(By.linkText("Forgot your password?")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		Thread.sleep(500);
		String passwordText = driver.findElement(By.className("infoMsg")).getText();
		String []passwordArray = passwordText.split("'");
		String [] passwordArray2 = passwordArray[1].split("'");
		String password = passwordArray2[0];
		return password;
		
	}

}
