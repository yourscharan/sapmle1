package com.hrm.hrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App 


{
    
    @Test
    public void login(){
      System.setProperty("webdriver.chrome.driver", "D:/Qaplanet/chromedriver.exe");
      WebDriver d=new ChromeDriver();
      d.manage().window().maximize();
      d.get("http://apps.qaplanet.in/hrm/login.php");
      d.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
      d.findElement(By.name("txtPassword")).sendKeys("lab1");
      d.findElement(By.name("Submit")).click();
      d.close();
    }
        
   
}
