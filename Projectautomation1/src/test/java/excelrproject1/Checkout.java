package excelrproject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkout {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Mainclass cout=new Mainclass(driver);
		
		cout.url();
		cout.username();
		cout.pwd();cout.lbtn();
		cout.addtocart();
		cout.addcartlink();
		cout.checkout();
		cout.firstname();
		cout.lastname();
		cout.postalcode();
		cout.cont();
		cout.fnsh();

	}

}
