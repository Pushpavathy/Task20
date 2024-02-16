package task20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GuviSignup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Launch broswer
		WebDriver driver = new ChromeDriver();

//Launch the URL
		driver.get("https://www.guvi.in");
		
//Maximize the browser
		driver.manage().window().maximize();

//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
//Loacting Sign up button
		WebElement sign = driver.findElement(By.xpath("//a[contains(@class,'text-white')]"));
		sign.click();
		
//Locating First name by xpath
		WebElement namepath = driver.findElement(By.xpath("//input[@id ='name']"));
		namepath.sendKeys("Kaniyan. N");

//Locating email by xpath
		WebElement emailpath = driver.findElement(By.xpath("//input[@id='email']"));
		emailpath.sendKeys("kaniyan0912@gmail.com");

//Locating password by xpath
		WebElement passwordpath = driver.findElement(By.xpath("//input[@id='password']"));
		passwordpath.sendKeys("Manto@01");
		
//Locating Mobilenum by id		

		WebElement mob = driver.findElement(By.xpath("//input[@id='mobileNumber']"));
		mob.sendKeys("9874561240");	

//Locating signup by xpath		

				WebElement signup = driver.findElement(By.xpath("//a[@id='signup-btn']"));
				signup.click();	
				Thread.sleep(3000);
//Select thecurrent profile value
				WebElement profilevalue = driver.findElement(By.id("profileDrpDwn"));
				Select profile = new Select(profilevalue);
				profile.selectByIndex(1);

//Select degree  value
				WebElement degreevalue = driver.findElement(By.id("degreeDrpDwn"));
				Select degree = new Select(degreevalue);
				degree.selectByValue("B.E. / B.Tech. ECE");

//Select yr of passing
				WebElement passingvalue = driver.findElement(By.id("year"));
				passingvalue.sendKeys("2016");
//Click on submit
				WebElement submitbutton = driver.findElement(By.id("details-btn"));
				submitbutton.click();
			Thread.sleep(3000);
	}

}
