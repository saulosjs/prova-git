package shopp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tudo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.advantageonlineshopping.com/#/");
		driver.findElement(By.id("menuUser")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/login-modal/div/div/div[3]/a[2]")).click();

//		driver.findElement(By.name("usernameRegisterPage")).sendKeys("JN");
//		driver.findElement(By.name("emailRegisterPage")).sendKeys("JN");
//		driver.findElement(By.name("passwordRegisterPage")).sendKeys("JN");
//		driver.findElement(By.name("confirm_passwordRegisterPage")).sendKeys("JN");
//		driver.findElement(By.name("first_nameRegisterPage")).sendKeys("JN");
//		driver.findElement(By.name("last_nameRegisterPage")).sendKeys("JN");
//		driver.findElement(By.name("phone_numberRegisterPage")).sendKeys("JN");
//		driver.findElement(By.name("countryListboxRegisterPage")).sendKeys("JN");
//		driver.findElement(By.name("cityRegisterPage")).sendKeys("JN");
//		driver.findElement(By.name("state_/_province_/_regionRegisterPage")).sendKeys("JN");
//		driver.findElement(By.name("postal_codeRegisterPage")).sendKeys("JN");

//		driver.findElement(By.name("username")).sendKeys("asd");
//		driver.findElement(By.name("password")).sendKeys("asd");
		String mano = "do s";
	}

}
