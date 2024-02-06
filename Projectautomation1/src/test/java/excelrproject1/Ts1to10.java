package excelrproject1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Ts1to10 {
	WebDriver driver = new ChromeDriver();
	@BeforeMethod
	public void launchingApp() throws Exception {
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	@DataProvider(name = "logindata")
	public Object[][] logindata() {
		Object[][] logindetails = new Object[7][2];
		//Validate with valid credentials
		logindetails[0][0] = "standard_user";
		logindetails[0][1] = "secret_sauce";
		//Validate with invalid Username and valid Password.
		logindetails[1][0] = "jyoti_user";
		logindetails[1][1] = "secret_sauce";
		//Validate with valid Username and invalid Password
		logindetails[2][0] = "standard_user";
		logindetails[2][1] = "swaglabs";
		//Validate with valid Username and password field is empty.
		logindetails[3][0] = "standard_user";
		logindetails[3][1] = "  ";
		//Validate with Username field is empty and valid Password
		logindetails[4][0] = "  ";
		logindetails[4][1] = "secret_sauce";
		//Validate with Username and password fields are empty.
		logindetails[5][0] = "  ";
		logindetails[5][1] = "  ";
		//Validate with invalid credentials
		logindetails[6][0] = "jyoti_123";
		logindetails[6][1] = "swaglabs";
		return logindetails;
	}

	@Test(dataProvider = "logindata")
	public void loginfunctionality(String username, String password) throws Exception {
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		//Validate the Login button is clickable.
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
	}
//Validate the Username and password fields are availabe and displayed.
	@Test(priority = 1)
	public void disply() {
		Boolean dis = driver.findElement(By.id("user-name")).isDisplayed();
		Boolean pass = driver.findElement(By.id("password")).isDisplayed();
		Boolean dis1 = driver.findElement(By.id("user-name")).isEnabled();
		Boolean pass1 = driver.findElement(By.id("password")).isEnabled();
		if (dis == true && dis1 == true) {
			System.out.println("Username field is displayed and enabled");
		} else {
			System.out.println("Username field is not displayed and not enabled");
		}

		if (pass == true && pass1 == true) {
			System.out.println("Password field is Displayed and Enabled");
		} else {
			System.out.println("password field is not Displyed and not enabled");
		}
		//Validate the watermark in Username and password field.
		String username = driver.findElement(By.id("user-name")).getAccessibleName();
		String passwd = driver.findElement(By.id("password")).getAccessibleName();
		System.out.println("watermark text username: " + username);
		System.out.println("watermark text password: " + passwd);
	}

	@AfterTest
	public void clo() {
		driver.close();
	}

}
