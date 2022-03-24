package testpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestNGsample {
  @Test
  public void f() {
	  System.out.println("Test2");  
	  System.out.println("Test");  
	  
	  System.out.println("setUp");
	  System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
	  ChromeDriver driver = new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/index.php/");
      WebElement title_Login=driver.findElement(By.id("logInPanelHeading"));
      //Name of the text
      System.out.println(title_Login.getText());
      //Print Tag name
      System.out.println(title_Login.getTagName());
      WebElement uname=driver.findElement(By.id("txtUsername"));
      WebElement pwd=driver.findElement(By.id("txtPassword"));
      uname.clear();
      uname.sendKeys("Admin");
      pwd.clear();
      pwd.sendKeys("admin123");
      WebElement loginBtn=driver.findElement(By.name("Submit"));
      //WebElement loginBtn=driver.findElement(By.id("btnLogin"));
      loginBtn.click();
  }
  @Test
  public void g() {
	  System.out.println("Test2");
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("AfterMethod");
	  
	  
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClass");
	 
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("AfterClass");
	  
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforeTest");
	  
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("afterTest");
	  
	  
  }

}
