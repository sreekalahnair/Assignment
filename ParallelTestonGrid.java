package com.seleniumgrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTestonGrid {
	
  WebDriver driver;
  @Parameters({"bname"})
  @Test
  public void testParallel(String bname) throws MalformedURLException, InterruptedException {
	  
	  if (bname.equals("chrome"))
	  {
		  
	  ChromeOptions cap=new ChromeOptions();
		  driver=new RemoteWebDriver(new URL("http://localhost:4444"), cap);
		  System.out.println("connection established with chrome browser");}
  
  else if(bname.equals("firefox"))
  {
	  
	  FirefoxOptions cap=new FirefoxOptions();
	  driver=new RemoteWebDriver(new URL("http://localhost:4444"), cap);
	  System.out.println("connection established with firefox browser");}
	  
  
	  
   else if(bname.equals("edge")) {
	  EdgeOptions cap=new EdgeOptions();
	  driver=new RemoteWebDriver(new URL("http://localhost:4444"), cap);
	  System.out.println("connection established with edge browser");}
	  
	  
	  Thread.sleep(5000);
	  driver.get("https://www.amazon.in");
	  System.out.println("Title is: "+driver.getTitle());
	  driver.quit();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}