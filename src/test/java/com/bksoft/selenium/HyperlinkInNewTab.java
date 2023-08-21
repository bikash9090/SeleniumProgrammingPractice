package com.bksoft.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HyperlinkInNewTab {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "D:\\EclipseProjects\\SeleniumProgamingPractice\\BrowserDriver\\chromedriver.exe");
				//System.setProperty("webdriver.edge.driver", "D:\\EclipseProjects\\SeleniumProgamingPractice\\BrowserDriver\\msedgedriver.exe");
				System.setProperty("webdriver.gecko.driver", "D:\\Eclipse Projects\\SeleniumProgrammingPractice\\Browser_Drivers\\msedgedriver.exe");
				
				WebDriver driver = new EdgeDriver();
				
				driver.get("https:google.com");
				driver.manage().window().maximize();
				
				//WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5000));
				Thread.sleep(3000);
			
				
				
				driver.quit();

	}

}
