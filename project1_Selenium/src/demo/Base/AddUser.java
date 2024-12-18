package demo.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

public class AddUser {

	public static void main(String[] args) {

		WebDriver driver1 = new ChromeDriver();

		// Due to new upgrade of OrangeHRMlive, it is not working without implicit wait()function.
		driver1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver1.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement username = driver1.findElement(By.cssSelector("input[name^='userna']"));
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
		driver1.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		btnAdd.click();

		// Now AddUser form opened

		// 1. User Role
		WebElement dropdown = driver1.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]"));

		// 2. EmpName

		WebElement EmpName = driver1.findElement(By.cssSelector("input[placeholder^='Type for hints']"));

		// 3.Status
		WebElement dropdown1 = driver1.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]"));
		// WebElement dropdown1 = driver1.findElement(By.xpath("//input[@id='txtSearchText']/parent::div"));

		// 4.Username

		WebElement username1 = driver1.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input"));
		// 5.Password
		WebElement password1 = driver1.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input"));

		// 6.Confirm Password
		WebElement ConfirmPassword = driver1.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input"));

		// Save Button
		WebElement btnSave = driver1.findElement(By.xpath("//button[@type='submit' and contains(., 'Save')]"));

		dropdown.sendKeys("Admin");

		EmpName.sendKeys("Candice  Raynor");
		dropdown1.sendKeys("Enabled");

		username1.sendKeys("Rupali"); 
		password1.sendKeys("new@123");

		ConfirmPassword.sendKeys("new@123");

		// 7.Click on Save button
		// btnSave.click();
		
		System.out.println("Demo for GITHUB");
	}

}
