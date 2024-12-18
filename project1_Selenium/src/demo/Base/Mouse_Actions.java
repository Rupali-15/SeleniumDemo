package demo.Base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Actions {
	WebDriver driver;
	void startBrowser() {
		driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");
		driver.manage().window().maximize();
	}
	void ClickandHold() {
		
		WebElement clickable = driver.findElement(By.id("clickable"));
		Actions actions = new Actions(driver);
		actions.clickAndHold(clickable).sendKeys("rrrr").keyDown(Keys.SHIFT).sendKeys("rupali").keyUp(Keys.SHIFT).release().perform();
	}
	void Hover() {
		WebElement hover1 = driver.findElement(By.id("hover"));
		Actions actions = new Actions(driver);
		actions.pause(Duration.ofMillis(5000)).moveToElement(hover1);
	}
	void XandY_axis_draganddrop() {
		
	}
	void draganddrop() {
		
		WebElement dragBox = driver.findElement(By.id("draggable"));
		WebElement dropBox = driver.findElement(By.id("droppable"));
		Actions actions = new Actions(driver);
		actions.pause(Duration.ofMillis(5000)).dragAndDrop(dragBox, dropBox).perform();
		
	}
	public static void main(String[] args) {
		Mouse_Actions obj = new Mouse_Actions();
		obj.startBrowser();
		//obj.ClickandHold();
		obj.Hover();
		//obj.XandY_axis_draganddrop();
		//obj.draganddrop();
			
	}

}
