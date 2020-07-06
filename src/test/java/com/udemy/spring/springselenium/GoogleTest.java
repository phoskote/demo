package com.udemy.spring.springselenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.udemy.spring.springselenium.page.Google.GooglePage;

public class GoogleTest extends SpringBaseTestNGTest {
	
	@Autowired
	private GooglePage gpage;
	
	@Test
	public void googleTest() {
		this.gpage.goTo();
		Assert.assertTrue(this.gpage.isAt());
		
		this.gpage.getSearchComponent().search("spring boot");
		Assert.assertTrue(this.gpage.getSearchResult().isAt());
		Assert.assertTrue(this.gpage.getSearchResult().getCount() > 2 );
	}
	
	@Test
	public void testApp() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setBrowserName(BrowserType.CHROME);;
		
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.100:4545/wd/selenium-hub"), cap);
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Learn Automation");
		Thread.sleep(5000);
		driver.quit();
	}

}
