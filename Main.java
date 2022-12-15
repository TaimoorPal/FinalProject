package FinalProject;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Main {
	WebDriver driver;
	POM obj;
	@BeforeTest
	public void Setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\4397\\\\Documents\\\\SQA\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://release01.curemd.com/curemdy/datlogin.asp");
		obj = new POM(driver);
		PropertyConfigurator.configure("log4j.properties");
		
	}
	@Test(priority=1)
	public void Test1() throws InterruptedException {
		obj.Login();
		
	}
	@Test(priority=2)
	public void Test2() throws InterruptedException {
		obj.AddPatient();

	}
		
	@Test(priority=3)
	public void Test3() throws InterruptedException {
		obj.CreateCase();

	}
	@Test(priority=4)
	public void Test4() throws InterruptedException {
		obj.CreateProviderNotes();

	}
	@Test(priority=5)
	public void Test5() throws InterruptedException {
		obj.AddDiagnosis();

	}
	@Test(priority=6)
	public void Test6() throws InterruptedException {
		obj.AddProcedure();

	}
	@Test(priority=7)
	public void Test7() throws InterruptedException {
		obj.SuperBill();

	}
}
