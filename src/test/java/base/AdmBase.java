package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class AdmBase 
{
		public WebDriver driver;
		Properties prop;
	
		public void loadprop() throws IOException {
			FileInputStream propo=new FileInputStream("src/test/resources/config.properties");
			prop=new Properties();
			prop.load(propo);
		}
		@BeforeClass
		public void SetConfig() throws IOException, InterruptedException {
			loadprop();
			String browser=prop.getProperty("browser").toLowerCase();

			if (browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			driver.get(prop.getProperty("url"));
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		}
		
			else if(browser.equalsIgnoreCase("firefox")) {
		
		driver=new FirefoxDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

			}}       
			   
@AfterClass
public void tearDown() {
    if (driver != null) {
        driver.quit();
    }
}
}

			


			       
		    




