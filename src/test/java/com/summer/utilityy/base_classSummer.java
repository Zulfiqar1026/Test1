package com.summer.utilityy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base_classSummer {

	public static Properties propsum;
	public static WebDriver driver;
	
	
	public base_classSummer() {
		
		propsum = new Properties();
		try {
			FileInputStream flssum = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\summer\\configuresummer\\configsummer.properties");
			propsum.load(flssum);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void initbrowsersum() {
		
		String browsersetsum = propsum.getProperty("Browser20");
		
		if (browsersetsum.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\WebDriverSummer\\chromedriver.exe");
			driver = new ChromeDriver ();
//			driver.manage().deleteAllCookies();
//			driver.get("https://www.demoblaze.com/");
			driver.manage().timeouts().pageLoadTimeout(testdatasummer.pageLoadTimeout1, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(testdatasummer.implicitlyWait1, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			System.out.println("Chrome Browser Launch");
			
			
		}
		else if(browsersetsum.equals("FF"));
		
		
		
		
	}
	
	public static void getURLsum (String URLSUM) {
		
		driver.get(propsum.getProperty("URLSUM"));
		
		
		
		
	}
	
	
}
