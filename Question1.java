package task20;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//Launch browser
		WebDriver driver = new ChromeDriver();
	
//Get the URL
		driver.get("https://jqueryui.com/datepicker/");
		
//Maximize the browser
		
		driver.manage().window().maximize();
//Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//	switch to frame.
		driver.switchTo().frame(0);

//Click on the date ppicker
		WebElement dateclick = driver.findElement(By.className("hasDatepicker"));
		dateclick.click();

//Select the next month 
		WebElement nextmonth = driver.findElement(By.xpath("//a[contains(@class,'ui-datepicker-next')]"));
		nextmonth.click();

//Select the date 22
		WebElement datepick= driver.findElement(By.xpath("//a[text()='22']"));
		datepick.click();
		String datetext = datepick.getText();
		System.out.println("Date is " +datetext);
		
 //Close the window.
	driver.quit();
	
	
	}
}
