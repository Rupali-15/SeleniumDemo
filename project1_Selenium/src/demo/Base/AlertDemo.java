package demo.Base;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertDemo {

		
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/documentation/webdriver/interactions/alerts/");
		
		driver.manage().window().maximize();
		
		/*WebElement alertBox=driver.findElement(By.linkText("See an example alert"));
		Actions actions=new Actions(driver);
		actions.click(alertBox).pause(5000).perform();
		
		Alert alert=driver.switchTo().alert();
		alert.accept();*/
		
		/*----------confirm -----------------------------
		WebElement confirmBox=driver.findElement(By.linkText("See a sample confirm"));
		Actions actions=new Actions(driver);
		actions.click(confirmBox).pause(20000).perform();
		
		Alert alert=driver.switchTo().alert();
		alert.accept();
		*/
		//---------------prompt------------------------
				WebElement promptBox=driver.findElement(By.linkText("See a sample prompt"));
				Actions actions=new Actions(driver);
				 actions.click(promptBox).pause(20000).perform();
				
				
		

	}

}
