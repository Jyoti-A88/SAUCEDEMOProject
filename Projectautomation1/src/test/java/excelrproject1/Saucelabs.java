package excelrproject1;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Saucelabs {
	public class Project1 {
		WebDriver driver = new ChromeDriver();

		@BeforeMethod
		public void launchingApp() throws Exception {

			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			driver.findElement(By.id("login-button")).click();

			Thread.sleep(2000);

		}

		@Test
		public void addtocart() throws Exception {

			driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
			Thread.sleep(2000);
		}

		@Test
		public void addtocartitems() throws Exception {

			List<WebElement> addcart = driver
					.findElements(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory ']"));
			for (int i = 0; i < addcart.size(); i++) {
				addcart.get(i).click();
				Thread.sleep(1000);
			}
		}

		@AfterTest
		public void clo() {
			driver.close();
		}
	}

}
