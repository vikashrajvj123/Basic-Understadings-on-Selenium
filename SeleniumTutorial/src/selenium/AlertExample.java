package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikashrs\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		WebElement alertBox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		alertBox.click();
		Alert alert = driver.switchTo().alert();
	    alert.accept();
	    Thread.sleep(3000);
	    
	    WebElement conformBox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		conformBox.click();
		Alert conformAlert = driver.switchTo().alert();
		conformAlert.dismiss();
		Thread.sleep(3000);
		
		WebElement promptBox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
		promptBox.click();
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("Vikash");
		promptAlert.accept();
		Thread.sleep(3000);
		
	    
	}

}
