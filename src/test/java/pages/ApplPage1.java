package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ApplPage1
{
	
		WebDriver driver;
		JavascriptExecutor js = (JavascriptExecutor) driver;


	    
	    public ApplPage1(WebDriver driver) 
	    {
	        this.driver = driver;
	    }
	    
	    public void NewAppl()
	    {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	    	WebElement start = wait.until(ExpectedConditions.elementToBeClickable(By.id("hypNewApplication")));
	       	start.click();
	    	
	    	}
	    public void selectsem()
	    {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    	WebElement sem = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@name='ddlSemester']")));
	    	sem.click();
	    	Select select = new Select(sem);
	    	select.selectByVisibleText("Fall 2026-27");
	    	    
	    }
	    public void selectdeg()
	    {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    	WebElement deg = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@name='ddlDegree']")));
	    	deg.click();
	    	Select select = new Select(deg);
	    	select.selectByVisibleText("Bachelor");
	   
	    }
	    public void selectpgm()
	    {
	    	WebElement pgm=driver.findElement(By.xpath("//select[@name='ddlProgram']"));
	    	pgm.click();
	    	Select select = new Select(pgm);
	    	select.selectByValue("55"); // value="2"

	   
	    }
	    public void selectfund()
	    {
	    	WebElement fund=driver.findElement(By.xpath("//select[@name='ddlFundType']"));
	    	fund.click();
	    	Select select = new Select(fund);
	    	select.selectByVisibleText("Self- Fund");
	   
	    }
	    public void selectfundsub()
	    {
	    	
	    
	    	// Scroll to bottom
	    	js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	    	WebElement subtype=driver.findElement(By.xpath("//select[@name='ddlSponsor']"));
	    	subtype.click();
	    	Select select = new Select(subtype);
	    	select.selectByValue("19");

	   
	    }
	    public void selectapptype()
	    {
	    	WebElement appltype=driver.findElement(By.xpath("//select[@name='ddlApplicantType']"));
	    	appltype.click();
	    	Select select = new Select(appltype);
	    	select.selectByValue("1"); 

	   
	    }
	    public void selectstdytype()
	    {
	    	WebElement stdy=driver.findElement(By.xpath("//select[@name='ddlStudyType']"));
	    	stdy.click();
	    	Select select = new Select(stdy);
	    	select.selectByValue("1"); 

	   
	    }
	    public void  save()
	    {
	    	WebElement save=driver.findElement(By.id("btnSaveApplicantData"));
	    	save.click();
	    	
	    }
	    public void editapl()
	    {
	    	WebElement editapp=driver.findElement(By.xpath("(//span[@class='text'])[3]"));
	    	editapp.click();
	    }
	    public void nextpage()
	    {
	    	js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	    	WebElement next=driver.findElement(By.id("btnAdmissioninfoNext"));
	    	next.click();
	    	
	    }
	    public void dash()
	    {
	    	WebElement dashb=driver.findElement(By.xpath("(//a[contains(text(), 'Dashboard')])[1]"));
	    	dashb.click();
	    	
	    }
	    public void user()
	    {
	    	WebElement user=driver.findElement(By.xpath("//span[@class='mr-2 d-lg-inline text-gray-600 small']"));
	    	user.click();
	    	
	    }
	    public void Logout()
	    {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    	WebElement lgt = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='dropdown-item']")));
	    	lgt.click();
	    	WebElement logout= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn btn-gold']")));
	    	logout.click();
	    }
	    public void forgtp()
	    
	    {
	    	WebElement fgt=driver.findElement(By.xpath("(//a[@class='forgot'])[1]"));
	    	fgt.click();
	    	WebElement back=driver.findElement(By.linkText(("Sign in")));
	    	back.click();
	    	
	    	}
	    
	    
	    
	    
	    
	    


	    
}
