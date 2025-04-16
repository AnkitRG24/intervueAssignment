package intervue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Intervuelogin {
	public static void main(String[] args) throws InterruptedException {

		// setup

		WebDriver driver = new ChromeDriver();

		// launch browser

		driver.get("https://www.intervue.io");

		// maximize

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@id='iv-homepage-login']//div//span[contains(text(),'Login')]")).click();

		// wait

		driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));		
		
		driver.findElement(By.xpath("/html/body/section[1]/div/div/div[1]/div/div/a")).click();
		Thread.sleep(2000);
		
		WebElement uname = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[3]/div/div/div/div[2]/form/div[1]/div/div/span/input"));
		uname.sendKeys("neha@intervue.io");
		
		//Thread.sleep(2000);
		
		WebElement pswrd = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[3]/div/div/div/div[2]/form/div[2]/div/div/span/input"));
		pswrd.sendKeys("Ps@neha@123");

		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[3]/div/div/div/div[2]/form/div[4]/div/div/span/button")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Dashboard')]"))); 

		

		// closing browser

		driver.close();

	}

		
	}