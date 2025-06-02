package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.AdmBase;
import pages.ApplPage1;
import pages.LoginPage;

public class AdmTest extends AdmBase {

    LoginPage obj;
    ApplPage1 ap1j;

    @BeforeClass
    public void objinit() {
        driver.get("https://kcst-ui.campusnext.net/Public/OnlineAdmission/Signin.aspx");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        obj = new LoginPage(driver);
    }

    @Test(priority = 1)
    public void LoginTest() 
    {	
    	obj.reg();
        obj.username("ruby.nazreen1@gmail.com");
        obj.Pass("Rubymol123/");
        obj.btnclick();
        
    }
    	@Test(priority=2)

    	public void Apptest1()
    	{
    		ap1j = new ApplPage1(driver); // pass the driver
    		ap1j.NewAppl();
    	/*	ap1j.selectsem();
    		ap1j.selectdeg();
    		ap1j.selectpgm();
    		ap1j.selectfund();
    		ap1j.selectfundsub();
    		ap1j.selectapptype();
    		ap1j.selectstdytype();
    		ap1j.save();
    		ap1j.editapl();
    		ap1j.nextpage();*/
    		ap1j.dash();
    		ap1j.user();
    		ap1j.Logout();
    		ap1j.forgtp();
    	}
		@Test(priority=3)
		public void NEgtestLogin1()
		{
			obj.username("ruby.nazreen@gmail.com");
			obj.Pass("Rubymol23/");
			obj.btnclick();
			String errtxt=driver.findElement(By.xpath("//span[text()='Username or password is incorrect']")).getText();
			System.out.println(errtxt);
	
		}
		@Test(priority=4)
		public void NEgtestLogin2()
		{
			obj.username("   ");
			obj.Pass("Rubymol123/");
			obj.btnclick();
			String errtxt=driver.findElement(By.xpath("//span[text()='Please Provide usernam and password']")).getText();
			System.out.println(errtxt);
	
		}

@Test(priority=5)
public void NEgtestLogin3()
{
	obj.username("ruby.nazreen1@gmail.com");
	obj.Pass("123456");
	obj.btnclick();
	String errtxt=driver.findElement(By.xpath("//span[text()='Username or password is incorrect']")).getText();
	System.out.println(errtxt);

}

@Test(priority=6)
public void NEgtestLogin4()
{
	obj.username("ruby.nazreen1@gmail.com");
	obj.Pass("     ");
	obj.btnclick();
	String errtxt=driver.findElement(By.xpath("//span[text()='Please Provide usernam and password']")).getText();
	System.out.println(errtxt);
	
}

   @AfterMethod
    public void tearDown() {
        driver.navigate().refresh(); // Optional: Reset state after each test
    }
   @AfterClass
   public void quit() {
       if (driver != null) {
           driver.quit();
       }
   }
   }



