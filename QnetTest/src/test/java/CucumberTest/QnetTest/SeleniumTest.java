package CucumberTest.QnetTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniumTest {
	
	@Test
	public void test(){
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anusha.D\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://portal.qnetindia.net/VirtualOffice4/OnlineEStore/Online_Login_Vihaan.aspx");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id=\"ctl00_ContentPlaceHolder1_txtTCO\"]")).sendKeys("IN110525");
		driver.findElement(By.xpath("//input[@id=\"ctl00_ContentPlaceHolder1_txtPassword\"]")).sendKeys("30DEC88");
		driver.findElement(By.xpath("//input[@id=\"ctl00_ContentPlaceHolder1_btnLogin\"]")).click();	
	}
}
