package excelrproject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Ts14 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Mainclass lk=new Mainclass(driver);
		lk.url();
		lk.username();
		lk.pwd();lk.lbtn();
		lk.addtocart();
		lk.addcartlink();
		lk.continueshopping();
	}

}
