package excelrproject1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Mainclass {
	WebDriver driver;

	public Mainclass(WebDriver driver) {

		this.driver = driver;
	}

	By usernm = By.id("user-name");
	By pass = By.id("password");
	By loginbtn = By.id("login-button");
	By alnk = By.xpath("//a[@class='shopping_cart_link']");
	By cout = By.id("checkout");
	By Fn = By.id("first-name");
	By Ln = By.id("last-name");
	By PC = By.id("postal-code");
	By Nxt = By.id("continue");
	By Fns = By.id("finish");
	By addcrt = By.xpath("//button[@class='btn btn_primary btn_small btn_inventory ']");
	By twit = By.xpath("//*[@id=\"page_wrapper\"]/footer/ul/li[1]/a");
	By facebk = By.xpath("//*[@id=\"page_wrapper\"]/footer/ul/li[2]/a");
	By Insta = By.xpath("//*[@id=\"page_wrapper\"]/footer/ul/li[3]/a");
	By prodcont = By.xpath("//*[@class='product_sort_container']");
	By Plh = By.xpath("//*[@value='lohi']");
	By Phl = By.xpath("//*[@value='hilo']");
	By Natoz = By.xpath("//*[@value='az']");
	By Nztoa = By.xpath("//*[@value='za']");
	By rmv = By.id("remove-sauce-labs-backpack");
	By rmv1 = By.id("remove-sauce-labs-bike-light");
	By cntshop = By.id("continue-shopping");
	By bmenu = By.id("react-burger-menu-btn");
	By abt = By.id("about_sidebar_link");
	By lout = By.id("logout_sidebar_link");
	By shopcont = By.id("continue-shopping");

	public void url() throws Exception {
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
	}

	public void username() {
		driver.findElement(usernm).sendKeys("standard_user");
	}

	public void pwd() {
		driver.findElement(pass).sendKeys("secret_sauce");

	}

	public void lbtn() throws Exception {
		driver.findElement(loginbtn).click();
		Thread.sleep(2000);

	}

	public void addcartlink() throws Exception {
		driver.findElement(alnk).click();
		Thread.sleep(2000);

	}

	public void checkout() throws Exception {
		driver.findElement(cout).click();
		Thread.sleep(2000);

	}

	public void firstname() {
		driver.findElement(Fn).sendKeys("Jyoti");
		;

	}

	public void lastname() {
		driver.findElement(Ln).sendKeys("Naveen");
		;

	}

	public void postalcode() throws Exception {
		driver.findElement(PC).sendKeys("123456");
		Thread.sleep(2000);
	}

	public void cont() throws Exception {
		driver.findElement(Nxt).click();
		Thread.sleep(2000);

	}

	public void fnsh() throws Exception {
		driver.findElement(Fns).click();
		Thread.sleep(2000);

	}

	public void addtocart() throws Exception {

		List<WebElement> addct = driver.findElements(addcrt);
		for (int i = 0; i < 3; i++) {
			addct.get(i).click();
			Thread.sleep(1000);
		}
	}

	public void twitter() throws Exception {
		driver.findElement(twit).click();
		Thread.sleep(2000);
	}

	public void facebook() throws Exception {
		driver.findElement(facebk).click();
		Thread.sleep(2000);
	}

	public void Instagram() throws Exception {
		driver.findElement(Insta).click();
		Thread.sleep(2000);
	}

	public void productcontainer() throws Exception {
		driver.findElement(prodcont).click();
		Thread.sleep(4000);
	}

	public void pricelh() throws Exception {
		driver.findElement(Plh).click();
		Thread.sleep(4000);
	}

	public void pricehl() throws Exception {
		driver.findElement(Phl).click();
		Thread.sleep(2000);
	}

	public void nameaz() throws Exception {
		driver.findElement(Natoz).click();
		Thread.sleep(2000);
	}

	public void nameza() throws Exception {
		driver.findElement(Nztoa).click();
		Thread.sleep(2000);
	}

	public void remove() throws Exception {
		driver.findElement(rmv).click();
		Thread.sleep(2000);
	}

	public void remove1() throws Exception {
		driver.findElement(rmv1).click();
		Thread.sleep(2000);
	}

	public void continueshopping() throws Exception {
		driver.findElement(cntshop).click();
		Thread.sleep(2000);
	}

	public void burgermenu() throws Exception {
		driver.findElement(bmenu).click();
		Thread.sleep(2000);
	}

	public void about() throws Exception {
		driver.findElement(abt).click();
		Thread.sleep(4000);
	}

	public void logout() throws Exception {
		driver.findElement(lout).click();
		Thread.sleep(2000);
	}

	public void navigate() throws Exception {
		driver.navigate().back();
		Thread.sleep(2000);
	}

	public void contshop() throws Exception {
		driver.findElement(shopcont).click();
		Thread.sleep(2000);

	}

}
