package task20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuviLoginPage {
	public static void main(String[]args) throws InterruptedException

	{
//Launch broswer
		WebDriver driver = new ChromeDriver();

//Launch URL
		driver.get("https://www.guvi.in/");
		
//Maximize the browser
		driver.manage().window().maximize();

//Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

//Click on login button.
		WebElement login = driver.findElement(By.xpath("//a[contains(@class,'text-primary')]"));
		login.click();
		
//enter email
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("kaniyan0912@gmail.com");
	
//Locating password by xpath
		
		WebElement passwordpath = driver.findElement(By.id("password"));
		passwordpath.sendKeys("Manto@01");
		Thread.sleep(3000);
		
//Click on login button
		
		WebElement loginbutton = driver.findElement(By.id("login-btn"));
		loginbutton.click();

	}
}
