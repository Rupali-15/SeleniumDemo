package demo.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");

		WebElement email = driver.findElement(By.cssSelector("#my-text-id"));

		WebElement password = driver.findElement(By.cssSelector("input[name^='my-pass']"));

		WebElement textarea = driver.findElement(By.cssSelector("textarea[name^='my-text']"));

		// WebElement disabledInput
		// =driver.findElement(By.name("//input[@name='my-disabled']"));//Disabled input
		// WebElement readOnly
		// =driver.findElement(By.name("//input[@name='my-readonly']y"));//read-only

		Select dropdown = new Select(driver.findElement(By.cssSelector("select[class^='form-sel']")));

		WebElement dropDownSelect = driver.findElement(By.cssSelector("input[name^='my-datalist']"));// dropdown 1

		// WebElement myFile = driver.findElement(By.name("my-file"));//filename

		WebElement chkBox = driver.findElement(By.cssSelector("#my-check-1"));// checkbox

		WebElement radioBox = driver.findElement(By.cssSelector("#my-radio-1"));// radiobox

		// WebElement btnSubmit
		// =driver.findElement(By.cssSelector("//button[@type='submit']"));//submit btn

		WebElement datepicker = driver.findElement(By.cssSelector("input[name^='my-date']"));

		WebElement color = driver.findElement(By.cssSelector("input[value^='#563d7c']"));

		WebElement btnSubmit = driver.findElement(By.cssSelector("button[class^='btn ']"));

		email.sendKeys("abc@gmail.com");

		password.sendKeys("Gl@mour123");

		textarea.sendKeys("London UK");

		dropdown.selectByIndex(1);

		dropDownSelect.sendKeys("New York");

		datepicker.sendKeys("12/01/2024");

		color.sendKeys("#ff5733"); // #563d7c choose another color code
		//radioBox.click();
		// btnSubmit.click();
		//driver.close();
		//driver.quit();
	}

}
