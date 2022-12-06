package common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class newJobBase {
	
	
public WebDriver driver;

public void lanchBrowser() {
	
WebDriverManager.chromedriver().setup();

driver= new ChromeDriver();

driver.get("https://pro.housecallpro.com/pro/log_in");

driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

}

public void closeBrowser() {
	
	driver.close();
}

	
}
