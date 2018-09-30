package steps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utils.ReadExcel;

public class Login extends ReadExcel{
public InternetExplorerDriver driver; 
	
	@Given ("I launch the browser")
	public void launch_Browser()throws AWTException, InterruptedException {
		System.setProperty("webdriver.ie.driver", ".//drivers/IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		Thread.sleep(4000);
		Robot robot = new Robot();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_F11);
	}
	
	@And ("I load the (.*)")
	public void loadURL(String url)  {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);		
	}
	
	@Then ("I enter the (.*)")
	public void enterCredentialsFromExcel(String credentials) throws IOException {
		readExcel(credentials);
		driver.findElement(By.id("uname")).sendKeys(getUname());
		driver.findElement(By.id("pass")).sendKeys(getPWD());
	}

}
