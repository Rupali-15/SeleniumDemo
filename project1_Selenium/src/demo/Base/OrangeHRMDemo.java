package demo.Base;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

public class OrangeHRMDemo {
	WebDriver driver1;
	
	void startBrowser() {
		
		driver1 = new ChromeDriver();
		driver1.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver1.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver1.manage().window().maximize();
		
	}

	void Adduser() {
		
		
		Actions actions = new Actions(driver1);
		
		WebElement username = driver1.findElement(By.cssSelector("input[name^='username']"));
		WebElement password = driver1.findElement(By.cssSelector("input[name^='passw']"));

		WebElement btnLogin = driver1.findElement(By.cssSelector("button[class^='oxd-']"));

		username.sendKeys("Admin");
		password.sendKeys("admin123");
		btnLogin.click();

		// Tab Admin clicked  
		WebElement tabAdmin = driver1.findElement(By.cssSelector("a[href='/web/index.php/admin/viewAdminModule']"));
		tabAdmin.click();

		// Button Add clicked
		WebElement btnAdd = driver1.findElement(By.xpath("//button[@type='button' and contains(., 'Add')]"));
		
			
		btnAdd.click();
		
		// Now AddUser form opened
		
		// 1. User Role
		WebElement userRole = driver1.findElement(By.cssSelector("#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div:nth-child(1) > div > div:nth-child(1) > div > div:nth-child(2) > div > div"));

		// 2. EmpName

		WebElement EmpName = driver1.findElement(By.cssSelector("input[placeholder^='Type for hints']"));

		// 3.Status
		WebElement status = driver1.findElement(By.cssSelector("#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div:nth-child(1) > div > div:nth-child(3) > div > div:nth-child(2) > div > div"));

		// 4.Username

		WebElement username1 = driver1.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input"));
		// 5.Password
		WebElement password1 = driver1.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input"));

		// 6.Confirm Password
		WebElement ConfirmPassword = driver1.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input"));

		// Save Button
		WebElement btnSave = driver1.findElement(By.xpath("//button[@type='submit' and contains(., 'Save')]"));



		actions.click(userRole).keyDown(Keys.DOWN).release().keyUp(Keys.ENTER).perform();

		EmpName.sendKeys("Candice  Raynor");

		actions.click(status).keyDown(Keys.DOWN).release().keyUp(Keys.ENTER).perform();

		username1.sendKeys("Rupali");

		password1.sendKeys("new@123");

		ConfirmPassword.sendKeys("new@123");

		// 7.Click on Save button
		// btnSave.click();
	}

	public static void main(String[] args) {

		OrangeHRMDemo obj = new OrangeHRMDemo();
		
		obj.startBrowser();
		obj.Adduser();
		
		

	}

}
