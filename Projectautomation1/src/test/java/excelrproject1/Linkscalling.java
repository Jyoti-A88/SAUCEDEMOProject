package excelrproject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Linkscalling {
	@Test
	public void linkscall() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Mainclass lk=new Mainclass(driver);
		lk.url();
		lk.username();
		lk.pwd();lk.lbtn();
		lk.twitter();
		lk.facebook();
		lk.Instagram();
	}
}
