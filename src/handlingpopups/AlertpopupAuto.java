package handlingpopups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertpopupAuto {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","./Soft123/geckodriver.exe");
	         WebDriver driver = new FirefoxDriver();
	         driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
         WebElement al = driver.findElement(By.xpath("//input[@type='submit']")); 
         al.click();  
        Thread.sleep(2000);
         Alert alert = driver.switchTo().alert();
         String as = alert.getText();
        System.out.println(as);
        
        if(as.equals("Please enter a valid user name")) {
        	 System.out.println("correct alert message");
        	 
        }else{
        	System.out.println("in-correct alert message");
       	 
        }
        alert.accept();
        
                 
		}

	}


