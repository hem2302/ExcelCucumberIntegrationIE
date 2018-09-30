package steps;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Testing {

public static void main(String[] args) {

	System.setProperty("webdriver.ie.driver", ".//drivers/IEDriverServer.exe");
	InternetExplorerDriver driver = new InternetExplorerDriver();
	driver.get("https://google.com");
}

}
