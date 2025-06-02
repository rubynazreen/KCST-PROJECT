package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    WebDriver driver;

    
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void reg()
    {
    	WebElement reg=driver.findElement(By.xpath("//a[text()='Create an account ?']"));
    	reg.click();
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    	WebElement back = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sign in")));
    	back.click();
    }

    
    public void username(String email) {
        WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        username.sendKeys(email);
    }

    public void Pass(String passwd) {
        WebElement password = driver.findElement(By.xpath("//input[@name='txtPassword']"));
        password.sendKeys(passwd);
    }

    public void btnclick() {
        WebElement btn = driver.findElement(By.id("btnLogin"));
        btn.click();
    }
}
