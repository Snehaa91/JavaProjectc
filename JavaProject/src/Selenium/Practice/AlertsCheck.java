package Selenium.Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsCheck {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\SKhuswah\\eclipse-workspace\\JavaProject\\src\\Selenium\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fgp%2Fcustomer-preferences%2Fselect-language%2Fref%3Dnav_signin%3FpreferencesReturnUrl%3D%252Fgp%252Fcustomer-preferences%252Fselect-language%252Fref%253Dtopnav_lang%253FpreferencesReturnUrl%253D%25252F&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	    driver.findElement(By.id("ap_email")).sendKeys("snehaa91@gmail.com");
	    driver.findElement(By.id("continue")).click();
	    driver.findElement(By.id("ap_password")).sendKeys("Zidd@0291");
	    driver.findElement(By.id("signInSubmit")).click();
	    
	    Alert a = driver.switchTo().alert();
	    a.accept();
	    a.dismiss();
	    a.sendKeys("Sneha");
	    a.getText();
	    		
	    		
	}

}
