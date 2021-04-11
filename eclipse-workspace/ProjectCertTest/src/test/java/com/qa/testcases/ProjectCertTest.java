package com.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

public class ProjectCertTest{
    
	private static final WebDriver driver = null;




	@Test(priority='1')
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		// Enter the URL of PHP Application
		
		driver.get("http://54.170.28.123:8084/");
		
		Thread.sleep(3000);
		
		//driver.findElement(By.id("wpName2")).sendKeys("SeleniumTest");
 
           //   Now use XPATH to write the locator value.
           // Enter the URL of PHP Application
           String title = driver.getTitle();
		   System.out.println(title);
		   driver.findElement(By.linkText("Home")).click();
		   
		   Thread.sleep(3000);
		   
		   driver.findElement(By.linkText("About Us")).click();
           
		   Thread.sleep(3000);
		   
		   //driver.findElement(By.id("Element_Id"));
		   
		   
		   
		   //driver.findElement(By.name("//*[@id=\"PID-p4d-pg\"]")).click();
		   
		   Thread.sleep(3000);
           
		   //driver.findElement(By.linkText("Contact")).click();
		   
		   Thread.sleep(3000);

           

	}




 @Test(priority='2')
 public void closebrowser()
 
 {
	driver.close();
	
	
	
	
}
}