package testpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class TestNg  {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("https://www.google.com");
	  driver.manage().window().maximize();
	  driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
	  ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,1200)");
	  driver.switchTo().frame("courses-iframe");
	  ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,500)");
//	  driver.findElement(By.xpath("//a[text()='Consulting']")).click();
	  ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,500)");
	  driver.findElement(By.xpath("//a[text()='Consulting']")).click();
	  driver.findElement(By.name("username")).sendKeys("Harsha");
	  driver.findElement(By.name("mobileno")).sendKeys("7095845186");
	  driver.findElement(By.name("email")).sendKeys("lankaharshavardhan007@gmail.com");
	  driver.findElement(By.name("requirements")).sendKeys("The assignment is about to navigate into a website and have to go inside another page within.After that we have to fill out the form available under consulting heading."
	  		+ "After filling out the form it should send a message regarding project to our email mentioned.");
	  Select programming = new Select(driver.findElement(By.name("input-programming-language")));
	  programming.selectByVisibleText("Java");
	  ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,1000)");
	  driver.findElement(By.xpath("//input[@id='sharing']")).click();
	  Select timezone = new Select(driver.findElement(By.name("input-timezone")));
	  timezone.selectByVisibleText("(GMT+05:30)Chennai,Kolkata,Mumbai,New Delhi");
	  driver.findElement(By.xpath("//input[@id='afford']//div[text()='Yes']")).click();
	  WebElement sendmessage =driver.findElement(By.xpath("//button[text()='Send Message']"));
	  sendmessage.click();
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
  }

}